package food;

public class Mushrooms extends Grass{

    @Override
    public String getName() {
        return "mushrooms";
    }

    @Override
    public int fullnessValue() {
        return 7;
    }
}
