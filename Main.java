package DependencyInjection_Ex;

public class Main {
    public static void main(String[] args) {
        // ferrari car
        Engine engine = new Engine("ferrari engine");
        Wheel wheel = new Wheel("ferrari wheel");

        Car ferrariCar = new Car(new Facilities(engine,wheel),true);

        // vin car
        Engine engine1 = new Engine("vin engine");
        Wheel wheel1 = new Wheel("vin wheel");

        Car vinCar = new Car(new Facilities(engine,wheel),false);

        // print
        System.out.println(ferrariCar);
        ferrariCar.fly();

        System.out.println(vinCar);
        vinCar.fly();

    }
}
