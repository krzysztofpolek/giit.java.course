package chapter2;

import org.omg.CORBA.IntHolder;

public class Task4 {

    public static void main(String[] args) {

//      Dlaczego nie można zaimplementować w Javie metody zamieniającej zawartość
//      dwóch zmiennych typu int? Zamiast tego napisz metodę zamieniającą zawartość
//      dwóch obiektów IntHolder. (Dokumentację tej dość prostej klasy znajdziesz
//      w dokumentacji API). Czy możesz zamienić zawartość dwóch obiektów typu Integer?

        System.out.println("Nie można zaimplementować metody zmieniającej zawartość dwóch zmiennych int");
        System.out.println("ponieważ zasięg wykonanej modyfikacji jest utracony wraz z zakończeniem metody.\n");

        System.out.println("Metoda z parametrami IntHolder");
        IntHolder number1 = new IntHolder(1);
        IntHolder number2 = new IntHolder(2);

        System.out.println("Liczba pierwsza: " + number1.value);
        System.out.println("Liczba druga: " + number2.value);

        changeParamaters(number1, number2);

        System.out.println("Liczba pierwsza po wykonaniu metody changeParamaters: " + number1.value + "\n");

        System.out.println("Nie można zmienić zwartości dwóch obiektów Integer.");
    }

    public static void changeParamaters(IntHolder a, IntHolder b) {

        a.value = b.value;

    }

}
