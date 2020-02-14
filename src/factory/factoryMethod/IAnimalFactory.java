package factory.factoryMethod;

public interface IAnimalFactory {
    Animals createAnimal(AnimalType animalType, String name);
}
