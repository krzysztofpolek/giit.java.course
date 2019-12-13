package chapter1;

import java.util.*;
import java.util.stream.Collectors;

public class Task14 {

    private static Scanner sc;

    public static void main(String[] args) {

//      Napisz program, który wczytuje dwuwymiarową tablicę liczb całkowitych i ustala,
//      czy jest ona kwadratem magicznym (takim, w którym sumy wartości we wszystkich
//      wierszach, wszystkich kolumnach i na przekątnych są równe). Wczytuj wiersze
//      zawierające liczby, które można odczytać jako liczby całkowite, i przerwij
//      wczytywanie po napotkaniu pustego wiersza. Na przykład dla danych
//      16 3 2 13
//      3 10 11 8
//      9 6 7 12
//      4 15 14 1
//      (Pusty wiersz)
//      Twój program powinien rozpoznać kwadrat magiczny.

        sc = new Scanner(System.in);

        System.out.print("Podaj ilość wierszy: ");

        int couterRow = 0;

        try {

            couterRow = sc.nextInt();

        } catch (InputMismatchException ex) {

            System.out.println("Błędna liczba. Spróbuj jeszcze raz!");
            System.exit(0);

        }

        System.out.println("Zapisane liczby w wierszu należy rozdzielić spacją.");

        List<List<Integer>> sqrt = new ArrayList<>();

        for(int i = 0; i < couterRow; i++) {

            System.out.print("Podaj liczby w " + (i + 1) + " wierszu: ");

            sc = new Scanner(System.in);

            String numbers = sc.nextLine();

            List<Integer> row = new ArrayList<>();

            try {

                row = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            }
            catch (NumberFormatException ex) {

                System.out.println("Błędna liczba. Spróbuj jeszcze raz!");
                System.exit(0);

            }


            if (row.size() != couterRow) {

                System.out.println("Podałeś złą ilość liczb. Spróbuj jeszczer raz!");
                break;

            }
            else {

                sqrt.add(i, row);

            }

        }

        chceckSqrt(sqrt);

    }

    private static void chceckSqrt(List<List<Integer>> list) {

        Set<Integer> sums = new HashSet<>();

        List<Integer> sumIntPerpendicularly = new ArrayList<>();
        List<Integer> sumIntDiagonal = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            List<Integer> row = list.get(i);

            int sumIntHorizontally = 0;

            for (int j = 0; j < row.size(); j++) {

                sumIntHorizontally += row.get(j);

                if (sumIntPerpendicularly.size() >= list.size()) {

                    sumIntPerpendicularly.set(j, row.get(j) + sumIntPerpendicularly.get(j));

                }
                else {

                    sumIntPerpendicularly.add(j, row.get(j));

                }

            }

            if (sumIntDiagonal.size() > 0) {

                sumIntDiagonal.set(0, sumIntDiagonal.get(0) + row.get(i));
                sumIntDiagonal.set(1, sumIntDiagonal.get(1) + row.get(list.size() - i - 1));

            }
            else {

                sumIntDiagonal.add(0, row.get(i));
                sumIntDiagonal.add(1, row.get(list.size() - 1));

            }

            sums.add(sumIntHorizontally);

            if(sums.size() > 1) {

                System.out.println("Kwadrat nie jest magiczny");
                System.exit(0);

            }

        }

        sums.addAll(sumIntPerpendicularly);
        sums.addAll(sumIntDiagonal);

        if(sums.size() > 1) {

            System.out.println("Kwadrat nie jest magiczny");
            System.exit(0);

        }
        else {

            System.out.println("Kwadrat jest magiczny");

        }

    }

}
