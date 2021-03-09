package animals;

import zooService.AviarySize;

public class Hedgehog extends Carnivorous implements Run, Voice {

    private static int count = 1;

    private final AviarySize aviarySize = AviarySize.Small;
    private final int number = count;

    public Hedgehog() {
        super("Hedgehog");
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
        System.out.println("Hedgehog is running.");
    }

    @Override
    public void runningFast() {
        System.out.println("Hedgehog is running very fast.");
    }

    @Override
    public void runningSlow() {
        System.out.println("Hedgehog is running very slow.");
    }

    @Override
    public String voice() {
        return "hssssssss!";
    }

    @Override
    public String voiceLoud() {
        return voice().toUpperCase();
    }


}
