package food;

public class SmallFish extends Meat{

    @Override
    public String getName() {
        return "small fish";
    }

    @Override
    public int fullnessValue() {
        return 6;
    }
}
