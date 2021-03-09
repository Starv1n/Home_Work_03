package zooService;

import animals.*;
import food.Food;
import food.WrongFoodException;

public class Worker {

    public void feed(Animal animal, Food food) {
        System.out.print("Worker is trying to feed " + animal.getAnimalType().toLowerCase() + " with " + food.getName() + ". ");
        try {
            animal.eat(food);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getVoice(Voice animal) {
        int i = (int) (Math.random() * 2 + 1);
        switch (i) {
            case 1: {
                System.out.println(((Animal) animal).getAnimalType() + "'s voice is " + "\"" + animal.voice() + "\"");
                break;
            }
            case 2: {
                System.out.println(((Animal) animal).getAnimalType() + "'s loud voice is " + "\"" + animal.voiceLoud() + "\"");
                break;
            }
        }
    }

    public void doAnimalRun(Run animal) {
        int i = (int) (Math.random() * 3 + 1);
        switch (i) {
            case 1: {
                animal.run();
                break;
            }
            case 2: {
                animal.runningFast();
                break;
            }
            case 3: {
                animal.runningSlow();
                break;
            }
        }
    }

    public void doAnimalSwim(Swim animal) {
        int i = (int) (Math.random() * 2 + 1);
        switch (i) {
            case 1: {
                animal.swim();
                break;
            }
            case 2: {
                animal.drown();
                break;
            }

        }
    }

    public void doAnimalFly(Fly animal) {
        int i = (int) (Math.random() * 2 + 1);
        switch (i) {
            case 1: {
                animal.fly();
                break;
            }
            case 2: {
                animal.fall();
                break;
            }
        }
    }
}
