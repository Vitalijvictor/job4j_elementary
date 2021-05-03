package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorFitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = CalculatorFit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01); //0.01 Delta
    }

    @Test
    public void whenWoman170Then69() {
    	short in = 170;
        double expected = 69;
        double out = CalculatorFit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01); //0.01 Delta
    }
}
