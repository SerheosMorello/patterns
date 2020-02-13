package delegate;

public class TopingDelegate implements Beverages {

    Beverages beverages;
    TopingDelegate(Beverages beverages){
        this.beverages = beverages;
    }

    public String getDescription() {
        return this.beverages.getDescription();
    }

    public int cost() {
        return this.beverages.cost();
    }
}