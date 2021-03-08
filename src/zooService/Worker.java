package zooService;

import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food) {
        System.out.print("Worker is trying to feed " + animal.getAnimalType().toLowerCase() + " with " + food.getName() + ". ");
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(((Animal)animal).getAnimalType() + " voice is "  + "\"" +animal.voice() + "\"");
    }
}

