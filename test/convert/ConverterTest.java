package convert;

import org.junit.Assert;

import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = (int) Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
    	int in = 180;
        int expected = 3;
        int out = (int) Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}