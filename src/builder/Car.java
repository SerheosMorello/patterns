package builder;

public class Car {
    private String name;
    private String color;
    private int maxSpeed;

    public static class Builder {
        private Car newCar;

        Builder(){
            newCar = new Car();
        }

        public Builder withName(String name){
            newCar.name = name;
            return this;
        }

        public Builder withColor(String color){
            newCar.color = color;
            return this;
        }

        public Builder withMaxSpeed(int maxSpeed){
            newCar.maxSpeed = maxSpeed;
            return this;
        }

        public Car build(){
            return newCar;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
