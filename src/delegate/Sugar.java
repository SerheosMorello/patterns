package delegate;

public class Sugar extends TopingDelegate {
    Sugar(Beverages beverages) {
        super(beverages);
    }

    @Override
    public String getDescription(){
        return beverages.getDescription()+"Sugar. ";
    }

    @Override
    public int cost(){
        return beverages.cost()+1;
    }
}