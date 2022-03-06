public class AnimalFactory {

    public Animal makeAnimal(String animalType) {

        if (animalType == null) {
            return null;
        } else if (animalType.equals("D")) {
            return new Dog();
        } else if (animalType.equals("C")) {
            return new Cat();
        }

        return null;
    }
}
