package DependencyInjection_Ex;

public class Facilities {
    private Engine engine;
    private Wheel wheel;
    private double price;

    public Facilities(Engine engine, Wheel wheel, double price) {
        this.engine = engine;
        this.wheel = wheel;
        this.price = price;
    }

    public Facilities(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
        this.price = 0;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Facilities{" +
                "engine=" + engine +
                ", wheel=" + wheel +
                ", price=" + price +
                '}';
    }
}
