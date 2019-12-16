package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

//      Napisz program, który zapisuje trójkąt Pascala do stopnia n w ArrayList<ArrayList<Integer>>.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj stopień trójkąta: ");

        int degree = scanner.nextInt();

        generateTrianglePascal(degree).forEach(System.out::println);

    }

    public static List<List<Integer>> generateTrianglePascal(int degree) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < degree; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0) {

                    row.add(j, j + 1);

                }
                else {

                    if (j < triangle.get(i -1).size() || j < triangle.get(i -1).size()) {

                        row.add(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));

                    }
                    else {

                        row.add(j, triangle.get(i - 1).get(j - 1));

                    }

                }

            }

            triangle.add(i, row);
        }

        return triangle;

    }

}
