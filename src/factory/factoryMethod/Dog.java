package factory.factoryMethod;

public class Dog extends Animals {

    Dog(String name){
        this.name = name;
    }

    @Override
    public String getSound(){
        return "gaw";
    }

}
