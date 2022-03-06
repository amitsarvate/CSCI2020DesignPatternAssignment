public abstract class Animal {

    public abstract String getSpecies();
    public abstract String getSound();

    public String toString() {
        return getSpecies() + " admitted into the Animal Shelter. " + getSound() + "!!";
    }
}
