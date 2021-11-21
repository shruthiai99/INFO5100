package neu_psa;

public class Main {

    public static void main(String[] args) {
        ICar sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println();
        ICar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
