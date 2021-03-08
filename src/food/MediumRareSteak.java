package food;

public class MediumRareSteak extends Meat{

    @Override
    public String getName() {
        return "medium rare steak";
    }

    @Override
    public int fullnessValue() {
        return 10;
    }
}
