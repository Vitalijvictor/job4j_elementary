package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import ru.job4j.condition.Max;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
    
    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
    
    @Test
    public void whenMax1To1Then1() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
    
    @Test
    public void whenMax3To6Then6() {
        int left = 3;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }
    
    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maxOfThree() {
        int a = 15;
        int b = 10;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maxOfFour() {
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;
        int result = Max.max(a, b, c, d);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maxOfTwoEquals() {
        int a = 10;
        int b = 10;
        int c = 15;
        int d = 15;
        int result = Max.max(a, b, c, d);
        Assert.assertEquals(15, result);
    }
}
