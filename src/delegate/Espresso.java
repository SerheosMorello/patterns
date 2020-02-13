package delegate;

public class Espresso implements Beverages {
    @Override
    public String getDescription() {
        return "30 ml of coffee. ";
    }

    @Override
    public int cost() {
        return 1;
    }
}