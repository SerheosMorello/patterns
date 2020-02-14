package delegate.main;

public class Milk extends TopingDelegate {
    public Milk(IBeverages beverages) {
        super(beverages);
    }

    @Override
    public String getDescription(){
        return beverages.getDescription()+"Milk. ";
    }

    @Override
    public int cost(){
        return beverages.cost()+2;
    }
}