package animals;


import zooService.AviarySize;

public class Platypus extends Carnivorous implements Run, Swim, Voice {

    private static int count = 1;

    private final AviarySize aviarySize = AviarySize.Big;
    private final int number = count;

    public Platypus() {
        super("Platypus");
        count++;
    }

    @Override
    public AviarySize getSize() {
        return aviarySize;
    }

    @Override
    public String getAnimalName() {
        return getAnimalType() + " № " + number;
    }

    @Override
    public void run() {
        System.out.println("Platypus is running.");
    }

    @Override
    public void swim() {
        System.out.println("Platypus is swimming.");
    }

    @Override
    public String voice() {
        return "Grrrhrhrhaouhdqoifd";
    }

}
