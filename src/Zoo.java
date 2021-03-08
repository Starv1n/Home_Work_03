import animals.*;
import zooService.Aviary;
import zooService.AviarySize;

public class Zoo {
    public static void main(String[] args) {

        Alpaca alpaca1 = new Alpaca();
        Alpaca alpaca2 = new Alpaca();
        Alpaca alpaca3 = new Alpaca();
        Capybara capybara = new Capybara();
        Fish fish = new Fish();

        Aviary<Herbivore> herbivoreAviary = new Aviary<>(AviarySize.Huge);
        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(AviarySize.Medium);

        herbivoreAviary.putAnimalToAviary(alpaca1);
        herbivoreAviary.putAnimalToAviary(alpaca2);
        herbivoreAviary.putAnimalToAviary(alpaca3);
        herbivoreAviary.putAnimalToAviary(alpaca3);
        carnivorousAviary.putAnimalToAviary(fish);

        System.out.println();

        herbivoreAviary.removeAnimalFormAviary(alpaca3.getUniqID());
        herbivoreAviary.putAnimalToAviary(alpaca3);
        carnivorousAviary.removeAnimalFormAviary(fish.getUniqID());

        System.out.println();

        herbivoreAviary.getAnimalLink(alpaca1.getUniqID());
        herbivoreAviary.getAnimalLink(alpaca2.getUniqID());
        herbivoreAviary.getAnimalLink(alpaca3.getUniqID());

    }
}
