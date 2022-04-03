package ru.job4j.convert;

import org.junit.Assert;

import org.junit.Test;

import ru.job4j.convert.Converter;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
    	int in = 180;
        int expected = 3;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert240RblThen3Pound() {
        int in = 240;
        int expected = 3;
        double out = Converter.rubleToPound(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}