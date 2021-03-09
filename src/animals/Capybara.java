package animals;

import zooService.AviarySize;

public class Capybara extends Herbivore implements Run, Swim, Voice {

    private static int count = 1;

    private final AviarySize aviarySize = AviarySize.Medium;
    private final int number = count;

    public Capybara() {
        super("Capybara");
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
    public void run() {
        System.out.println("Capybara is running.");
    }

    @Override
    public void runningFast() {
        System.out.println("Capybara is running very fast.");
    }

    @Override
    public void runningSlow() {
        System.out.println("Capybara is running very slow.");
    }

    @Override
    public void swim() {
        System.out.println("Capybara is swimming.");
    }

    @Override
    public void drown() {
        System.out.println("Capybara is drowning.");
    }

    @Override
    public String voice() {
        return "amazing sounds of capybara";
    }

    @Override
    public String voiceLoud() {
        return voice().toUpperCase();
    }
}
