package animals;

import food.Food;
import food.Seaweed;
import zooService.AviarySize;

public class Duck extends Herbivore implements Fly, Run, Voice, Swim {

    private static int count = 1;

    private final AviarySize aviarySize = AviarySize.Medium;
    private final int number = count;

    public Duck() {
        super("Duck");
        count++;
    }

    @Override
    public AviarySize getSize() {
        return aviarySize;
    }

    @Override
    public String getAnimalName() {
        return getAnimalType() + " № "+ number;
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void fall() {
        System.out.println("Duck has fallen.");
    }

    @Override
    public void run() {
        System.out.println("Duck is running.");
    }

    @Override
    public void runningFast() {
        System.out.println("Duck is running very fast.");
    }

    @Override
    public void runningSlow() {
        System.out.println("Duck is running very slow.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    @Override
    public void drown() {
        System.out.println("Duck is drowning.");
    }

    @Override
    public String voice() {
        return "quack";
    }

    @Override
    public String voiceLoud() {
        return voice().toUpperCase();
    }
}

