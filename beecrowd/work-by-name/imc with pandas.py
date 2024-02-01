# Código que calcula o IMC conforme a entrada do usuário e depois plota um gráfico com o auxílio do Pandas.
# O primeiro valor é o IMC original, o segundo o IMC multiplicado por 1,5 e o terceiro é o IMC dobrado.

import pandas as pd 
import matplotlib.pyplot as plt

kg = float(input("Digite a massa em kg: "))
altura = float(input("Digite a altura em metros: "))

imc = kg / (altura ** 2)

imc_series = pd.Series([imc, imc * 1.5, imc * 2.0])

imc_series_sorted = imc_series.sort_values()

imc_series_sorted.plot(kind='bar')
plt.title("Três valores de IMC em ordem crescente")
plt.xlabel("Ordem")
plt.ylabel("IMC")
plt.show()