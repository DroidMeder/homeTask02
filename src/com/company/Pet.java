package com.company;

public abstract class Pet implements Printable{
    private String animalName;
    private boolean isPetHerbivores;
    private String petWork;
    private String petEats;
    private int ageOfPet;

    public Pet(String animalName, boolean isPetHerbivores, String petWork, String petEats, int ageOfPet) {
        this.animalName = animalName;
        this.isPetHerbivores = isPetHerbivores;
        this.petWork = petWork;
        this.petEats = petEats;
        this.ageOfPet = ageOfPet;
    }

    public String getAnimalName() {
        return animalName;
    }

    public boolean isPetHerbivores() {
        return isPetHerbivores;
    }

    public String getPetWork() {
        return petWork;
    }

    public String getPetEats() {
        return petEats;
    }

    public int getAgeOfPet() {
        return ageOfPet;
    }
}
