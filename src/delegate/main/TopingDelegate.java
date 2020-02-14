package delegate.main;

public class TopingDelegate implements IBeverages {

    IBeverages beverages;
    TopingDelegate(IBeverages beverages){
        this.beverages = beverages;
    }

    public String getDescription() {
        return this.beverages.getDescription();
    }

    public int cost() {
        return this.beverages.cost();
    }
}