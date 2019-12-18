package chapter2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

//      Zmień program wyświetlający kalendarz w taki sposób, by zaczynał tydzień od
//      niedzieli. Niech dodaje też pusty wiersz na końcu (ale tylko jeden).


        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rok: ");

        int year = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {

            System.out.println("\n" + LocalDate.of(year, i, 1).getMonth().name());
            showHeaderWeek();
            showCalendar(year, i);

        }

    }

    public static void showCalendar(int year, int month) {

        System.out.println("");

        LocalDate date = LocalDate.of(year, month, 1);

        if (date.getDayOfWeek().getValue() != 7) {

            for (int j = 0; j < date.getDayOfWeek().getValue(); j++) {

                System.out.print("    ");

            }

        }

        for (int i = 0; i < date.lengthOfMonth(); i++) {

            int numberDate = date.plusDays(i).getDayOfMonth();
            int numberDateofWeek = date.plusDays(i).getDayOfWeek().getValue();

            if (numberDate < 10) {

                System.out.print(" ");

            }

            if (numberDateofWeek == 6) {

                System.out.println(" " + numberDate + " ");

            }
            else {

                System.out.print(" " + numberDate + " ");

            }

            if (i == date.lengthOfMonth() - 1 && numberDateofWeek != 6) {

                System.out.println("");

            }

        }

    }

    public static void showHeaderWeek() {

        System.out.println("");

        for(int i = 7; i > 0 ; i--) {

            System.out.print(DayOfWeek.of(i).getDisplayName(TextStyle.SHORT, Locale.ENGLISH) + " ");

        }

    }

}
