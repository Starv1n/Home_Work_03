package food;

public class Seaweed extends Grass{

    @Override
    public String getName() {
        return "seaweeds";
    }

    @Override
    public int fullnessValue() {
        return 6;
    }
}
