package zooService;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary<Type> {

    private final HashMap<Integer, Animal> aviary = new HashMap<>();

    AviarySize aviarySize;

    public Aviary(AviarySize aviarySize) {
        this.aviarySize = aviarySize;
    }

    public void putAnimalToAviary(Type type) {
        Animal animal = (Animal) type;
        if (this.aviarySize == animal.getSize() && aviary.get(animal.getUniqID()) == null) {
            aviary.put(animal.hashCode(), animal);
            System.out.println(animal.getAnimalName() + " like this aviary.");
        } else if (animal.equals(aviary.get(animal.getUniqID()))) {
            System.out.println(animal.getAnimalName() + " is already in the aviary.");

        } else {
            System.out.println(animal.getAnimalName() + " doesn't feel comfortable in this aviary. " +
                    "Please put it in the " + animal.getSize().toString().toLowerCase() + " aviary.");
        }
    }

    public void removeAnimalFormAviaryById(int uniqID) {
        if (aviary.get(uniqID) != null) {
            System.out.println(aviary.get(uniqID).getAnimalName() + " war removed from aviary.");
            aviary.remove(uniqID);
        } else {
            System.out.println("There is no such animal in the aviary.");
        }
    }

    public void getAnimalLink(int uniqID) {
        if (aviary.get(uniqID) != null){
            System.out.println(aviary.get(uniqID).getAnimalName() + "'s link is " + aviary.get(uniqID) + ".");
        }else {
            System.out.println("No animal = no link.");
        }
    }

    public void getAllAnimalsInAviary() {
        if (!aviary.isEmpty()) {
            System.out.println("List of animals in aviary:");
            for (Map.Entry<Integer, Animal> entry : aviary.entrySet()) {
                System.out.println(entry.getValue().getAnimalName());
            }
        }else {
            System.out.println("Aviary is empty.");
        }
        System.out.println();
    }
}


