package test;
import delegate.*;
import org.junit.*;

public class BeveragesCostTest {

    @Test
    public void TestCostOfEspresso(){
        Beverages espresso = new Espresso();
        Assert.assertEquals(1, espresso.cost());
    }

    @Test
    public void TestCostOfEspressoWithMilk(){
        Beverages espressoWithMils = new Milk( new Espresso());
        Assert.assertEquals(3, espressoWithMils.cost());
    }

    @Test
    public void TestCostOfEspressoWithSugare(){
        Beverages espressoWithSugare = new Sugar( new Espresso());
        Assert.assertEquals(2, espressoWithSugare.cost());
    }

    @Test
    public void TestCostOfEspressoWithSugareAndMilk(){
        Beverages espressoWithSugareAndMilk = new Milk( new Sugar( new Espresso()));
        Assert.assertEquals(4, espressoWithSugareAndMilk.cost());
    }

}
