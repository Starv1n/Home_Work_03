package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    Herbivore(String animalType) {
        super(animalType);
    }

    @Override
    public boolean eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(getAnimalType() + " is eating " + food.getName() + " with pleasure.");
            setFullness(food.fullnessValue());
            return true;
        } else {
            System.out.println(getAnimalType() + " dont want to eat " + food.getName() + ".");
            return false;
        }
    }
}
