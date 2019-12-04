package chapter1;

public class Task4 {

    public static void main(String[] args) {

//      Napisz program wyświetlający najmniejszą i największą liczbę dodatnią typu double.
//      Podpowiedź: poszukaj Math.nextUp w Java API.

        System.out.println("Największa dodatnia liczba typu double: " + Double.MAX_VALUE);
        System.out.println("Najmniejsza dodatnia liczba typu double: " + Math.nextUp(0.0));

    }

}
