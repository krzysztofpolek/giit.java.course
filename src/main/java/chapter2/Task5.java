package chapter2;

/**
 * Obiekt <code>Point</code> opisuje punkt na płaszczyźnie.
 * @author Krzysztof Polek
 * @version 1.0
 */

public class Task5 {

    public static void main(String[] args) {

//      Zaimplementuj niemodyfikowalną klasę Point opisującą punkt na płaszczyźnie.
//      Dołącz konstruktor ustawiający ją na konkretny punkt, konstruktor bez argumentów
//      ustawiający ją na punkt odniesienia oraz metody: getX, getY, translate i scale.
//      Metoda translate przesuwa punkt o podaną w zmiennych odległość w kierunku
//      x i y. Metoda scale skaluje obie współrzędne o podany współczynnik.
//      Zaimplementuj te metody w taki sposób, by w wyniku działania zwracały nowe
//      punkty. Na przykład wyrażenie
//      Point p = new Point(3, 4).translate(1, 3).scale(0.5);
//      powinno ustawić p na punkt o współrzędnych (2, 3.5).

        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("Punkt (" + p.getX() + ", " + p.getY() + ")");
    }

    public static class Point {

        double x;
        double y;

        Point (double x, double y) {

            this.x = x;
            this.y = y;

        }

        Point () {

            this.x = 0.0;
            this.y = 0.0;

        }

        public double getX() {

            return x;

        }

        public double getY() {

            return y;

        }

        /**
         * Przesuwa punkt o podaną w zmiennych odległość w kierunku x i y
         * @param x o ile przesunąć punkt względem osi x
         * @param y o ile przesunąć punkt względem osi y
         * @return Nowy punkt
         */
        public Point translate(double x, double y) {

            double a = this.x + x;
            double b = this.y + y;

            return new Point(a, b);
        }

        /**
         * Skaluje obie współrzędne o wskazany współczynnik.
         * @param number o ile skalować współrzędne
         * @return Nowy punkt
         */
        public Point scale(double number) {

            double a = this.x * number;
            double b = this.y * number;

            return new Point(a, b);

        }

    }

}
