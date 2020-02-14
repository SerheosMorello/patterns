package factory.factoryMethod;

public class App {
    public static void main(String[] args) {
        Animals dog  = new AnimalFactory().createAnimal(AnimalType.DOG, "Bim");
        Animals cat  = new AnimalFactory().createAnimal(AnimalType.CAT,"Tom");

        System.out.println("It is " + dog.getName() + " and he can say " + dog.getSound() );
        System.out.println("It is " + cat.getName() + " and he can say " + cat.getSound() );
    }
}
