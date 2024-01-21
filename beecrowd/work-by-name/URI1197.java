// URI 1197 - Volta a faculdade de física, funcionando para vários casos de teste, porém não termina em EOF (?)

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
        int v, t, distance;
        Scanner ler = new Scanner(System.in);
        v = ler.nextInt();
        t = ler.nextInt();

        distance = v * (t * 2);
        System.out.println(distance);
        }
    }
}