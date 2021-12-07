package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        Printable[] pets = {main.createObject("Cow"), main.createObject("Cat"),  main.createObject("Hen")};

        for (Printable p : pets
             ) {
            p.print();
        }

    }

    public Printable createObject(String className){
        return switch (className) {
            case "Cat" -> new Cat("Кот", false, "Истреблять мишей и крыс",
                    "Мыши и крысы", 2, 20);
            case "Hen" -> new Hen("Курица", false, "Нести яйц и высаживать цыплят",
                    "Разные зерновые и черви", 1, 1);
            case "Cow" -> new Cow("Корова", true, "Давать молоко людям",
                    "Травы из джайлоо", 3, 8);
            default -> null;
        };
    }
}
