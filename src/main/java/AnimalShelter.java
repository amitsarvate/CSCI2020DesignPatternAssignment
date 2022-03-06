/*

- Recording an incoming pet into the animal shelter

 */

import java.util.Scanner;

public class AnimalShelter {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        AnimalFactory animalFactory = new AnimalFactory();


        System.out.println("Enter the type of Animal being admitted into Animal Shelter (D / C)");
        String animalType = scan.nextLine();

        Animal newAnimal = animalFactory.makeAnimal(animalType);

        System.out.println(newAnimal);

    }




}
