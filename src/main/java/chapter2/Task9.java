package chapter2;

public class Task9 {

    public static void main(String[] args) {

//      Zaimplementuj klasę Car, która modeluje samochód poruszający się wzdłuż osi x
//      i zużywający w czasie jazdy benzynę. Dołącz metody pozwalające na przejechanie
//      podanej odległości w kilometrach, zatankowanie określonej ilości benzyny w litrach
//      oraz pobranie przejechanej odległości od początku podróży i poziomu benzyny.
//      Określ spalanie (w litrach na 100 km) w konstruktorze. Czy ta klasa powinna być
//      niemodyfikowalna? Dlaczego?


        Car car = new Car(10.0);

        System.out.println("Poziom paliwa: " + car.getFuel() + " l");
        System.out.println("Dystans: " + car.getDistance() + " km");

        car.setDistance(10.0);
        car.setPertol(20.0);

        System.out.println("Poziom paliwa: " + car.getFuel() + " l");
        car.setDistance(100.0);

        System.out.println("Dystans: " + car.getDistance() + " km");
        System.out.println("Poziom paliwa: " + car.getFuel() + " l");

        car.setDistance(100.0);

        System.out.println("Dystans: " + car.getDistance() + " km");
        System.out.println("Poziom paliwa: " + car.getFuel() + " l");

        car.setPertol(60.0);

        System.out.println("Poziom paliwa: " + car.getFuel() + " l");

    }

    public static class Car {

        private final double FULL_FUEL = 60.0;

        private double distance;
        private double fuel;
        private double consumption;

        Car(double consumption) {

            this.distance = 0.0;
            this.fuel = 0.0;
            this.consumption = consumption;

        }

        private boolean checkPetrol(double distance) {

            if(distance * this.consumption / 100 > this.fuel) {

                return false;

            }
            else {

                return true;

            }

        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {

            if (checkPetrol(distance)) {

                this.distance = distance;
                this.fuel -= (distance * this.consumption / 100);

            }
            else {

                System.out.println("Za mała ilość paliwa, aby przejechać " + distance + " km. Proszę zatankować.");

            }

        }

        public double getFuel() {
            return fuel;
        }

        public void setPertol(double fuel) {

            if (this.fuel + fuel > FULL_FUEL) {

                System.out.println("Maksymalnie można zatankować: " + FULL_FUEL + " litrów paliwa.");

            }
            else {

                this.fuel = fuel;

            }

        }

    }

}
