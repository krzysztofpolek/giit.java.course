package chapter1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

//      Napisz program, który wczytuje zmienną całkowitą i wyświetla ją w postaci liczby
//      binarnej, ósemkowej i szesnastkowej. Wyświetl jej odwrotność w postaci
//      szesnastkowej liczby zmiennoprzecinkowej.

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");

        int number = sc.nextInt();

        System.out.println("Format binarny: " + Integer.toBinaryString(number));
        System.out.println("Format ósemkowy: " + Integer.toOctalString(number));
        System.out.println("Format szesnastkowy: " + Integer.toHexString(number));

    }

}
