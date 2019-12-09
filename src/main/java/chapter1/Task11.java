package chapter1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

//      Napisz program, który wczytuje wiersz tekstu i wyświetla wszystkie litery, które
//      nie należą do zbioru ASCII wraz z ich wartościami Unicode.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");

        String text = scanner.nextLine();

        System.out.println("Znaki nie występujące w kodowaniu ASCII");

        int length = text.codePointCount(0, text.length());

        for(int i = 0; i < length; i++) {

            int codeUnicode = text.codePointAt(text.offsetByCodePoints(0, i));

            if (codeUnicode > 127) {

                System.out.println("Znak: " + text.charAt(i) + "; Unicode: " + codeUnicode);

            }

        }

    }

}
