package chapter2;

/**
 * Obiekt <code>Point</code> opisuje punkt na płaszczyźnie.
 * @author Krzysztof Polek
 * @version 1.0
 */
public class Task6 {

    public static void main(String[] args) {

//      Powtórz poprzednie ćwiczenie, ale translate i scale zaimplementuj jako metody
//      modyfikujące.

        Point p = new Point(3, 4);
        p.translate(1, 3);
        p.scale(0.5);
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
         */
        public void translate(double x, double y) {

            this.x += x;
            this.y += y;

        }

        /**
         * Skaluje obie współrzędne o wskazany współczynnik.
         * @param number o ile skalować współrzędne
         */
        public void scale(double number) {

            this.x *= number;
            this.y *= number;

        }

    }

}
