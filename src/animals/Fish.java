package animals;

import zooService.AviarySize;

public class Fish extends Carnivorous implements Swim {

    private static int count = 1;

    private final AviarySize aviarySize = AviarySize.Big;
    private final int number = count;

    public Fish() {
        super("Fish");
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
    public void swim() {
        System.out.println("Fish is swimming.");
    }

}
