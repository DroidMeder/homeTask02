package com.company;

public class Cat extends Pet{
    private int numberOfMiceHaveBeenKilledByCat;

    public Cat(String animalName, boolean isPetHerbivores, String petWork, String petEats, int ageOfPet, int numberOfMiceHaveBeenKilledByCat) {
        super(animalName, isPetHerbivores, petWork, petEats, ageOfPet);
        this.numberOfMiceHaveBeenKilledByCat = numberOfMiceHaveBeenKilledByCat;
    }

    public int getNumberOfMiceHaveBeenKilledByCat() {
        return numberOfMiceHaveBeenKilledByCat;
    }

    @Override
    public void print() {
        System.out.println("Название животного: "+getAnimalName()+", животное травоядное: "+isPetHerbivores()+
                "\nОсновное задача в хозяйстве: "+getPetWork()+", любимая пища животного: "+getPetEats()+
                "\nВозраст кота: "+getAgeOfPet()+" лет"+
                "\nВ месяц истребляет "+getNumberOfMiceHaveBeenKilledByCat()+" мышей и крыс.");
        System.out.println();
    }
}
