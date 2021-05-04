package Loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
    	int expected = 120;
        int result = Factorial.calc(n);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int n = 1;
    	int expected = 1;
        int result = Factorial.calc(n);
        Assert.assertEquals(expected, result);
    }
}
