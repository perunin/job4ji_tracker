package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Assert;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMaxSecondThen4() {
        int one = 1;
        int second = 4;
        int third = 3;
        int result = Max.max(one, second, third);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMaxFourThen10() {
        int one = 1;
        int second = 0;
        int third = 3;
        int four = 10;
        int result = Max.max(one, second, third, four);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }
}