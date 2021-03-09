package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal  {

    public Carnivorous(String animalType) {
        super(animalType);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(getAnimalType() + " is eating " + food.getName() + " with pleasure.");
            setFullness(food.fullnessValue());
        }else throw new WrongFoodException("Wrong food for carnivorous.");
    }
}