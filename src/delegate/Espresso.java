package delegate;

public class Espresso implements IBeverages {
    @Override
    public String getDescription() {
        return "30 ml of coffee. ";
    }

    @Override
    public int cost() {
        return 1;
    }
}