package chapter1;

public class Task5 {

    public static void main(String[] args) {

//      Co się stanie, jeśli wykonasz rzutowanie zmiennej typu double do typu int w sytuacji,
//      gdy ma ona większą wartość niż największa możliwa do zapisania w typie int?
//      Spróbuj.

        double number1 = 5547483650.0;
        int number2 = (int )number1;

        System.out.println("Rzeczywista watość liczby double: " + number1);
        System.out.println("Wartość liczby double rzutowanej na int: " +number2);
        System.out.println("Liczba została pomniejszona do max wartości dla typu int");

    }

}


//2147483647