package chapter1;

public class Task16 {

    public static void main(String[] args) {

//      Popraw metodę average w taki sposób, by przy jej wywoływaniu konieczne było
//      podanie przynajmniej jednego parametru.

        System.out.println(average(3));

    }

    public static double average(double value, double... values) {

        double sum = value;

        for (double v : values) sum += v;

        return sum / (values.length + 1);

    }

}
