package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String animalType) {
        super(animalType);
    }

    @Override
    public boolean eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(getAnimalType() + " is eating " + food.getName() + " with pleasure.");
            setFullness(food.fullnessValue());
            return true;
        } else {
            System.out.println(getAnimalType() + " dont want to eat " + food.getName() + ".");
            return false;
        }
    }
}