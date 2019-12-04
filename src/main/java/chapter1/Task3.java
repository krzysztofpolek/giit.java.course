package chapter1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

//      Korzystając z operatora warunkowego, napisz program, który wczytuje trzy liczby
//      całkowite i wyświetla największą z nich. Powtórz to samo z użyciem Math.max.

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę całkowitą: ");

        int number1 = sc.nextInt();

        System.out.print("Podaj drugą liczbę całkowitą: ");

        int number2 = sc.nextInt();

        System.out.print("Podaj trzecią liczbę całkowitą: ");

        int number3 = sc.nextInt();

        int result1 = number1 > number2 && number1 > number3 ? number1 : number2 > number3 ? number2 : number3;
        int result2 = Math.max(Math.max(number1, number2), number3);

        System.out.println("Wynik za pomocą instrukcji warunkowej IF: " + result1);
        System.out.println("Wynik za pomocą max: " + result2);

    }

}
