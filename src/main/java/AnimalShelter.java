import java.util.Scanner;

/**
 * Animal shelter build to interact and use animals created using AnimalFactory
 * User is able to specify the species of animals they are admitting into the shelter
 * Contains an object of the AnimalFactory class that is responsible for the creation of the
 * requested animal
 */
public class AnimalShelter {

    public static void main(String[] args) {

        // declaring scanner and animal factory objects
        Scanner scan = new Scanner (System.in);

        AnimalFactory animalFactory = new AnimalFactory();

        // getting user input from client
        System.out.println("Enter the type of Animal being admitted into Animal Shelter (Dog / Cat)");
        String animalType = scan.nextLine();

        // factory object creating the specific type of animal requested
        Animal newAnimal = animalFactory.makeAnimal(animalType);

        // outputting the toString method associated with the object (animal) created
        System.out.println(newAnimal);

    }
}
