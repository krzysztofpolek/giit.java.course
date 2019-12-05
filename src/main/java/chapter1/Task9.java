package chapter1;

public class Task9 {

    public static void main(String[] args) {

//      Podrozdział 1.5.3, „Porównywanie ciągów znaków”, zawiera przykład dwóch ciągów
//      znaków s i t takich, że s.equals(t), ale s != t. Podaj inny przykład bez korzystania
//      z metody substring.

        String textFirst = "World";
        String textSecond = new String("World");

        System.out.println("Dwa stringi utworzone za pomocą opertora konkatenacji oraz 'new'");
        System.out.println("Porównywanie ciągu 'equals': " + textFirst.equals(textSecond));
        System.out.println("Porównywanie ciągu '==': " + (textFirst == textSecond));

    }

}
