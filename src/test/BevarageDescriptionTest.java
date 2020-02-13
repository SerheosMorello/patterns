package test;
import delegate.*;
import org.junit.*;

public class BevarageDescriptionTest {

    @Test
    public void DescriptionEspressoTest(){
        Beverages espresso = new Espresso();
        Assert.assertEquals("30 ml of coffee. ", espresso.getDescription());
    }

    @Test
    public void DescriptionEspressoWithMilkTest(){
        Beverages espressoWithMilk = new Milk(new Espresso());
        Assert.assertEquals("30 ml of coffee. Milk. ", espressoWithMilk.getDescription());
    }

    @Test
    public void DescriptionEspressoWithMilkAndSugareTest(){
        Beverages espressoWithMilkAbdSugare = new Sugar( new Milk(new Espresso()));
        Assert.assertEquals("30 ml of coffee. Milk. Sugar. ", espressoWithMilkAbdSugare.getDescription());
    }
}
