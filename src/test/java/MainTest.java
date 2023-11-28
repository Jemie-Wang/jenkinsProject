import org.example.BasicCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    BasicCalculator calculator;

    @Before
    public void setup(){
        calculator = new BasicCalculator();
    }
    @Test
    public void testAdd(){
        int val1 = 9, val2 = 10;
        Assert.assertEquals(calculator.add(val1, val2), 19);
    }

    @Test
    public void testMinus(){
        int val1 = 10, val2 = 9;
        Assert.assertEquals(calculator.minus(val1, val2), 1);
    }

    @Test
    public void testMutiple(){
        int val1 = 2, val2 = 9;
        Assert.assertEquals(calculator.multiple(val1, val2), 18);
    }
}
