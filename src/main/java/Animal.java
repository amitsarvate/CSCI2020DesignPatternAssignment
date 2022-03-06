/**
 * Generic abstract base class of animal
 */
public abstract class Animal {

    // abstract methods to be implemented in subclasses
    public abstract String getSpecies();
    public abstract String getSound();

    /**
     * gives description of the animal created
     * @return string containing the sound and species of animal
     */
    public String toString() {
        return getSpecies() + " admitted into the Animal Shelter. " + getSound() + "!!";
    }
}
