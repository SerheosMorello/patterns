package builder;

public class App {
    public static void main(String[] args) {
        Car myCar = new Car.Builder().withName("BMW").withColor("Black").withMaxSpeed(260).build();
        System.out.println(myCar);
    }
}
