// URI 1197 - Volta a faculdade de física, funcionando para vários casos de teste, porém não termina em EOF (?)

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                int v, t, distance;

                v = scan.nextInt();
                t = scan.nextInt();

                // Verifica se v está dentro do intervalo (-100 ≤ v ≤ 100) e t está no intervalo (0 ≤ t ≤ 200)
                if (v >= -100 && v <= 100 && t >= 0 && t <= 200) {
                    distance = v * (t * 2);
                    System.out.println(distance);
                } else {
                    System.out.println("Valores fora do intervalo permitido. Tente novamente.");
                }
            } catch (NoSuchElementException e) {
                // Se não houver mais entradas, a exceção será lançada, e o loop será encerrado.
                break;
            }
        }
    }
}
