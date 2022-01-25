package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest  {

    @Test
    public void whenX0Y0ThenDistance0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double rsl = a.distance(b);
        double expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenX0Y2ThenDistance2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        double expected = 2;
        assertThat(rsl, is(expected));
    }
}