package delegate;

public class App {
    public static void main(String[] args) {

        IBeverages espresso = new Espresso();
        System.out.println("Description order: "+ espresso.getDescription());
        System.out.println("The cost: "+ Integer.toString(espresso.cost()));

        IBeverages espressoWihtMilk = new Milk(new Espresso());
        System.out.println("Description order: "+ espressoWihtMilk.getDescription());
        System.out.println("The cost: "+ Integer.toString(espressoWihtMilk.cost()));

        IBeverages espressoWithMilkAndSugar = new Milk(new Sugar(new Espresso()));
        System.out.println("Description order: "+ espressoWithMilkAndSugar.getDescription());
        System.out.println("The cost: "+ Integer.toString(espressoWithMilkAndSugar.cost()));
    }
}