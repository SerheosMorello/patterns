package test;
import delegate.*;
import org.junit.*;

public class BeveragesCostTest {

    @Test
    public void TestCostOfEspresso(){
        IBeverages espresso = new Espresso();
        Assert.assertEquals(1, espresso.cost());
    }

    @Test
    public void TestCostOfEspressoWithMilk(){
        IBeverages espressoWithMils = new Milk( new Espresso());
        Assert.assertEquals(3, espressoWithMils.cost());
    }

    @Test
    public void TestCostOfEspressoWithSugare(){
        IBeverages espressoWithSugare = new Sugar( new Espresso());
        Assert.assertEquals(2, espressoWithSugare.cost());
    }

    @Test
    public void TestCostOfEspressoWithSugareAndMilk(){
        IBeverages espressoWithSugareAndMilk = new Milk( new Sugar( new Espresso()));
        Assert.assertEquals(4, espressoWithSugareAndMilk.cost());
    }

}
