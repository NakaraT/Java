package ru.mirea.task6;

public class Animals implements Nameable {
    private String name;
    private String type;
    private String species;
    public String getName(){
        return name;
    }

    public Animals(String name, String type, String species) {
        this.name = name;
        this.type = type;
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
