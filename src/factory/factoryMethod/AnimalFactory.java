package factory.factoryMethod;

public class AnimalFactory implements IAnimalFactory {

    @Override
    public Animals createAnimal(AnimalType animalType, String name) {
        Animals animal = null;
        switch (animalType) {
            case CAT:
                animal =  new Cat(name);
            break;
            case DOG:
                animal = new Dog(name);
            break;
        }
        return animal;
    }

}
