package chapter1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

//      Napisz program, który oblicza silnię n! = 1*2*...*n, wykorzystując BigInteger.
//      Oblicz silnię 1000.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");

        int number = scanner.nextInt();

        System.out.println("Silnia z liczby " + number + " wynosi: " + silnia(number));

    }

    public static BigInteger silnia(int number) {

        return number != 1 ?  silnia(number - 1).multiply(BigInteger.valueOf(number)) : BigInteger.valueOf(1);


    }

}
