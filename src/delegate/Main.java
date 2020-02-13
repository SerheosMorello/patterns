package delegate;

public class Main {
    public static void main(String[] args) {

        Beverages espresso = new Espresso();
        System.out.println("Description order: "+ espresso.getDescription());
        System.out.println("The cost: "+ Integer.toString(espresso.cost()));

        Beverages espressoWihtMilk = new Milk(new Espresso());
        System.out.println("Description order: "+ espressoWihtMilk.getDescription());
        System.out.println("The cost: "+ Integer.toString(espressoWihtMilk.cost()));

        Beverages espressoWithMilkAndSugar = new Milk(new Sugar(new Espresso()));
        System.out.println("Description order: "+ espressoWithMilkAndSugar.getDescription());
        System.out.println("The cost: "+ Integer.toString(espressoWithMilkAndSugar.cost()));
    }
}