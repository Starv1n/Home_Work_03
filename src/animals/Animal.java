package animals;

import food.Food;
import food.WrongFoodException;
import zooService.AviarySize;

public abstract class Animal {

    public static int getCount() {
        return count;
    }

    private static int count;

    private final String animalType;
    private final int uniqID = count;

    private String fullness = "[..........]";

    private AviarySize size;
    private String animalName;

    Animal(String animalType) {
        this.animalType = animalType;
        count++;
    }

    public AviarySize getSize() {
        return size;
    }

    public int getUniqID() {
        return uniqID;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void getFullness() {
        System.out.println(animalType + " fullness is " + fullness);
    }

    public void setFullness(int value) {
        if (value >= 0 && value <= 10) {
            StringBuilder stringBuilder = new StringBuilder(fullness);
            for (int i = 1; i <= value; i++) {
                stringBuilder.setCharAt(i, '+');
            }
            this.fullness = stringBuilder.toString();
        }
    }

    @Override
    public int hashCode() {
        return getUniqID();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return uniqID == animal.uniqID;
    }

    public abstract void eat(Food food) throws WrongFoodException;
}
