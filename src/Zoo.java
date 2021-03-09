import animals.*;
import food.*;
import zooService.Aviary;
import zooService.AviarySize;
import zooService.Worker;

public class Zoo {
    public static void main(String[] args) {

        Worker worker = new Worker();

        Alpaca alpaca = new Alpaca();
        Alpaca alpaca1 = new Alpaca();
        Alpaca alpaca2 = new Alpaca();
        Alpaca alpaca3 = new Alpaca();
        Capybara capybara = new Capybara();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Hedgehog hedgehog = new Hedgehog();
        Platypus platypus = new Platypus();

        Food apples = new Apples();
        Food insects = new Insects();
        Food mediumRareSteak = new MediumRareSteak();
        Food mushrooms = new Mushrooms();
        Food seaweed = new Seaweed();
        Food smallFish = new SmallFish();

        Carnivorous[] carnivorous = new Carnivorous[]{fish, platypus, hedgehog};
        Herbivore[] herbivores = new Herbivore[]{alpaca, alpaca1, alpaca2, alpaca3, duck, capybara};
        Food[] foods = new Food[]{apples, insects, mediumRareSteak, mushrooms, seaweed, smallFish};
        Animal[] animals = new Animal[]{alpaca, alpaca1, alpaca2, alpaca3, duck, capybara, fish, platypus, hedgehog};

        Aviary<Herbivore> herbivoreAviary = new Aviary<>(AviarySize.Huge);
        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(AviarySize.Big);

        herbivoreAviary.getAllAnimalsInAviary();

        for (Carnivorous item : carnivorous) {
            carnivorousAviary.putAnimalToAviary(item);
        }

        System.out.println();

        for (Herbivore herbivore : herbivores) {
            herbivoreAviary.putAnimalToAviary(herbivore);
        }

        System.out.println();

        herbivoreAviary.getAllAnimalsInAviary();
        carnivorousAviary.getAllAnimalsInAviary();

        herbivoreAviary.removeAnimalFormAviaryById(alpaca3.getUniqID());
        herbivoreAviary.putAnimalToAviary(alpaca3);
        herbivoreAviary.putAnimalToAviary(alpaca3);
        carnivorousAviary.removeAnimalFormAviaryById(fish.getUniqID());

        System.out.println();

        herbivoreAviary.getAnimalLink(alpaca1.getUniqID());
        herbivoreAviary.getAnimalLink(alpaca2.getUniqID());
        herbivoreAviary.getAnimalLink(alpaca3.getUniqID());

        System.out.println();

        for (Food food : foods) {
            for (Carnivorous value : carnivorous) {
                worker.feed(value, food);
            }
            System.out.println();
        }

        System.out.printf("%-15s %-10s\n", "Animal name", "UniqID");
        for (Animal animal : animals) {
            System.out.printf("%-18s %-2s\n", animal.getAnimalName(), animal.getUniqID());
        }
    }
}
