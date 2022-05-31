package DependencyInjection_Ex;

public class Car implements IRunable,IFlyable {
    private Facilities facilities;
    private boolean canFly;

    public Car(Facilities facilities,boolean canFly) {
        this.facilities = facilities;
        this.canFly = canFly;
    }

    public Car(Facilities facilities) {
        this.facilities = facilities;
        this.canFly = false;
    }

    @Override
    public void run() {
        System.out.println("I am running with facilities : " + this);
    }

    @Override
    public void fly() {
        if (canFly){
            System.out.println("Can Fly");
        }else{
            System.out.println("Can not Fly");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "facilities=" + facilities +
                '}';
    }
}
