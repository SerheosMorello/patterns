package delegate.test;
import delegate.main.Espresso;
import delegate.main.Milk;
import delegate.main.IBeverages;
import delegate.main.Sugar;
import org.junit.*;

public class BeveragesDescriptionTest {

    @Test
    public void DescriptionEspressoTest(){
        IBeverages espresso = new Espresso();
        Assert.assertEquals("30 ml of coffee. ", espresso.getDescription());
    }

    @Test
    public void DescriptionEspressoWithMilkTest(){
        IBeverages espressoWithMilk = new Milk(new Espresso());
        Assert.assertEquals("30 ml of coffee. Milk. ", espressoWithMilk.getDescription());
    }

    @Test
    public void DescriptionEspressoWithMilkAndSugareTest(){
        IBeverages espressoWithMilkAbdSugare = new Sugar( new Milk(new Espresso()));
        Assert.assertEquals("30 ml of coffee. Milk. Sugar. ", espressoWithMilkAbdSugare.getDescription());
    }
}
