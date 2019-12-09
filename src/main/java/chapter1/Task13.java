package chapter1;

import java.util.*;

public class Task13 {

    public static void main(String[] args) {

//      Napisz program, który wyświetla zestawy liczb do Lotto, wybierając sześć różnych
//      liczb z zakresu od 1 do 49. Aby uzyskać sześć różnych liczb, zacznij od stworzenia
//      tablicy typu ArrayList, wypełnionej wartościami od 1 do 49. Losowo wybierz jedną
//      z liczb i usuń reprezentujący ją element z tablicy. Powtórz to sześć razy. Wyświetl
//      wylosowane liczby uporządkowane rosnąco.

        List lottoNumer = randomNumber(createNumberList(49), 6);

        Collections.sort(lottoNumer);

        lottoNumer.forEach(System.out::println);

    }

    public static List createNumberList(int numberMax) {

        List listNumber = new ArrayList();

        for (int i = 1; i <= numberMax; i++) {

            listNumber.add(i);

        }

        return listNumber;

    }

    public static List randomNumber(List listNumber, int numberCount) {

        List randomNumberList = new ArrayList();

        Random random = new Random();

        for (int i = 0; i < numberCount; i++) {

            int number = random.nextInt(listNumber.size());

            randomNumberList.add(listNumber.get(number));
            listNumber.remove(number);

        }

        return randomNumberList;
    }

}
