package chapter1;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

//      Napisz program, który wczytuje ciąg znaków i wyświetla wszystkie zawarte w nim
//      niepuste ciągi znaków.

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj ciąg znaków: ");

        String text = sc.nextLine();

        System.out.println("Podany tekst bez pustych znaków: " + text.replace(" ", ""));

    }

}
