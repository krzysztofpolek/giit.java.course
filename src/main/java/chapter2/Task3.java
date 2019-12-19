package chapter2;

public class Task3 {

    private static int parameter1 = 10;


    public static void main(String[] args) {

//      Czy może istnieć metoda modyfikująca zwracająca coś innego niż void? Czy może
//      istnieć metoda dostępowa zwracająca void? Jeśli tak, podaj przykłady.

        System.out.println("Wartość zmiennej parameter1 przed wywołanie metody modifiyingParameter: " + parameter1);

        System.out.println("Zwracana wartość metody modifiyingParameter: " + modifiyingParameter());

        System.out.println("Wartość zmiennej parameter1 po wywołanie metody modifiyingParameter: " + parameter1);

        int parameter2 = 100;

        System.out.println("Wartość zmiennej parameter2 przed wywołanie metody accessParameter: " + parameter2);

        accessParameter(parameter2);

        System.out.println("Wartość zmiennej parameter2 po wywołanie metody accessParameter: " + parameter2);


        System.out.println("Podsumowanie: \n1 - TAK\n2 - TAK");



    }

    public static int modifiyingParameter() {

        parameter1 = 20;

        return -1;

    }

    public static void accessParameter(int param) {

        param++;

        System.out.println("Wartość parametre2 po modyfikacji węwnątrz metody accessParameter: " + param);

    }

}
