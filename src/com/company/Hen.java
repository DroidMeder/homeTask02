package com.company;

public class Hen extends Pet{
    private int quantityEggsPerDay;
    public Hen(String animalName, boolean isPetHerbivores, String petWork, String petEats, int ageOfPet, int quantityEggsPerDay) {
        super(animalName, isPetHerbivores, petWork, petEats, ageOfPet);
        this.quantityEggsPerDay = quantityEggsPerDay;
    }

    public int getQuantityEggsPerDay() {
        return quantityEggsPerDay;
    }

    @Override
    public void print() {
        System.out.println("Название животного: "+getAnimalName()+", животное травоядное: "+isPetHerbivores()+
                "\nОсновное задача в хозяйстве: "+getPetWork()+", любимая пища животного: "+getPetEats()+
                "\nВозраст кота: "+getAgeOfPet()+" лет"+
                "\nВ день несет "+getQuantityEggsPerDay()+" яйц.");
        System.out.println();
    }
}
