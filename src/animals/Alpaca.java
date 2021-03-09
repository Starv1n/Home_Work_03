package animals;

import zooService.AviarySize;

public class Alpaca extends Herbivore implements Run, Voice {

    private static int count = 1;

    private final AviarySize aviarySize = AviarySize.Huge;
    private final int number = count;

    public Alpaca() {
        super("Alpaca");
        count++;
    }

    @Override
    public AviarySize getSize() {
        return aviarySize;
    }

    @Override
    public String getAnimalName() {
        return getAnimalType() + " № "+ number;   // Потому что нельзя давать имена тем, кого собираешься съесть.
    }

    @Override
    public void run() {
        System.out.println("Alpaca is running around with no sense.");
    }

    @Override
    public void runningFast() {
        System.out.println("Alpaca is running around very fast with no sense.");
    }

    @Override
    public void runningSlow() {
        System.out.println("Alpaca is running around very slow with no sense.");
    }

    @Override
    public String voice() {
        return "hmmmmmmmm-scree-haw!";
    }

    @Override
    public String voiceLoud() {
        return voice().toUpperCase();
    }
}
