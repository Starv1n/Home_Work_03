package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {

    Herbivore(String animalType) {
        super(animalType);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println(getAnimalType() + " is eating " + food.getName() + " with pleasure.");
            setFullness(food.fullnessValue());
        } else throw new WrongFoodException("Wrong food for herbivore.");
    }
}