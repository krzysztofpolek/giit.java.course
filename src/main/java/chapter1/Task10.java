package chapter1;

import java.util.Random;

public class Task10 {

    public static void main(String[] args) {

//      Napisz program, który tworzy losowy ciąg liter i cyfr, generując losową wartość
//      typu long i wyświetlając ją w systemie o podstawie 36.

        Random random = new Random();
        long number = random.nextLong();

        System.out.println("Wylosowana liczba: " + number);
        System.out.println("Liczba w systemie o podstawie 36: " + Long.toString(number, 36).toUpperCase());

    }

}
