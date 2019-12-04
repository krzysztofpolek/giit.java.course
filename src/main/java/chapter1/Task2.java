package chapter1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

//      Napisz program, który wczytuje liczbę całkowitą opisującą kąt (która może mieć
//      wartość dodatnią lub ujemną) i normalizuje ją do wartości od 0 do 359 stopni.
//      Najpierw spróbuj zrobić to za pomocą operatora %, a następnie za pomocą metody
//      floorMod.

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");

        int number = sc.nextInt();

        int resultProc = ((number + 0) % 360 + 360) % 360;
        int resultFloor = Math.floorMod(number, 360);

        System.out.println("Wynik za pomocą %: " + resultProc);
        System.out.println("Wynik za pomocą floorMod: " + resultFloor);

    }

}
