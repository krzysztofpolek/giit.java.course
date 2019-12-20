package chapter2;

public class Task6 {

    public static void main(String[] args) {

//      Powtórz poprzednie ćwiczenie, ale translate i scale zaimplementuj jako metody
//      modyfikujące.

        Point p = new Point(3, 4);
        p.translate(1, 3);
        p.scale(0.5);
        System.out.println("Punkt (" + p.getX() + ", " + p.getY() + ")");
    }

    static class Point {

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

        public void translate(double x, double y) {

            this.x += x;
            this.y += y;

        }

        public void scale(double number) {

            this.x *= number;
            this.y *= number;

        }

    }

}
