package chapter1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

//      Napisz program, który wczytuje dwie liczby z zakresu od 0 do 65 535, zapisuje je
//      w zmiennych typu short, a następnie oblicza bez znaku ich sumę, różnicę, iloczyn,
//      iloraz i resztę z dzielenia bez konwertowania ich do typu int.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę całkowitą z zakresu 0 - 65535: ");

        short numberFirst = (short) scanner.nextInt();


        System.out.print("Podaj drugą liczbę całkowitą z zakresu 0 - 65535: ");

        short numberSecond = (short) scanner.nextInt();

        System.out.println("Suma: " + (Short.toUnsignedLong(numberFirst) + Short.toUnsignedLong(numberSecond)));
        System.out.println("Różnica: " + (Short.toUnsignedLong(numberFirst) - Short.toUnsignedLong(numberSecond)));
        System.out.println("Iloczyn: " + (Short.toUnsignedLong(numberFirst) * Short.toUnsignedLong(numberSecond)));
        System.out.println("Iloraz: " + (Short.toUnsignedLong(numberFirst) / Short.toUnsignedLong(numberSecond)));
        System.out.println("Reszta z dzielenia: " + (Short.toUnsignedLong(numberFirst) % Short.toUnsignedLong(numberSecond)));

    }

}
