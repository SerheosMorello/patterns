package factory.factoryMethod;

public class Cat extends Animals {

    Cat(String name){
        this.name = name;
    }

    public String getSound(){
        return "miy";
    }
}
