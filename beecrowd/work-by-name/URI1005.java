// Código inicialmente refeito, com o auxílio de classes e objetos.

import java.util.Scanner;

class Aluno {
    private float nota1;
    private float nota2;

    public void lerNotas() {
        Scanner ler = new Scanner(System.in);
        this.nota1 = ler.nextFloat();
        this.nota2 = ler.nextFloat();
    }

    public double calcularMedia() {
        return ((this.nota1 * 3.5) + (this.nota2 * 7.5)) / 11;
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        // Lendo as notas do usuário
        aluno.lerNotas();

        // Calculando a média
        double media = aluno.calcularMedia();

        // Exibindo o resultado
        System.out.printf("MEDIA = %.5f\n", media);
    }
}