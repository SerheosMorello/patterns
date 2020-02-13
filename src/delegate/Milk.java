package delegate;

public class Milk extends TopingDelegate {
    Milk(Beverages beverages) {
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