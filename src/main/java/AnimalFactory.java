/**
 * AnimalFactory class responsible for creating specific type of animal specified by client
 * This is the interface for which the client interacts with
 * Implementation details are encapsulated within this class
 */
public class AnimalFactory {

    /**
     * method used to created the animal
     * @param animalType
     * @return specific subclass of animal based on parameter given
     */
    public Animal makeAnimal(String animalType) {

        if (animalType == null) {
            return null;
        } else if (animalType.equals("Dog")) {
            return new Dog();
        } else if (animalType.equals("Cat")) {
            return new Cat();
        }
        return null;

    }
}
