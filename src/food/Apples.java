package food;

public class Apples extends Grass{

    @Override
    public String getName() {
        return "apples";
    }

    @Override
    public int fullnessValue() {
        return 3;
    }
}
