package food;

public class Insects extends Meat{

    @Override
    public String getName() {
        return "insects";
    }

    @Override
    public int fullnessValue() {
        return 4;
    }
}
