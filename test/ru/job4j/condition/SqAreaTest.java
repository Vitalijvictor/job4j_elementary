package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    
    @Test
    public void whenP18K2Square18() {
        int expected = 18;
        int p = 18;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    
    @Test
    public void whenP12K2Square8() {
        int expected = 8;
        int p = 12;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    
    @Test
    public void whenP24K2Square32() {
        int expected = 32;
        int p = 24;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
