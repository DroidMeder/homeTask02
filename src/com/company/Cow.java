package com.company;

public class Cow extends Pet{
    private int amountOfMilkPerDay;

    public Cow(String animalName, boolean isPetHerbivores, String petWork, String petEats, int ageOfPet, int amountOfMilkPerDay) {
        super(animalName, isPetHerbivores, petWork, petEats, ageOfPet);
        this.amountOfMilkPerDay = amountOfMilkPerDay;
    }

    public int getAmountOfMilkPerDay() {
        return amountOfMilkPerDay;
    }

    @Override
    public void print() {
        System.out.println("Название животного: "+getAnimalName()+", животное травоядное: "+isPetHerbivores()+
                "\nОсновное задача в хозяйстве: "+getPetWork()+", любимая пища животного: "+getPetEats()+
                "\nВозраст кота: "+getAgeOfPet()+" лет"+
                "\nВ день даёт "+getAmountOfMilkPerDay()+" литров молока.");
        System.out.println();
    }
}
