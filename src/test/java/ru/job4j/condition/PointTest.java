package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Point;

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

    @Test
    public void whenX1Y0Z145andZ290ThenDistance145() {
        Point a = new Point(1, 0, 145);
        Point b = new Point(1, 0, 290);
        double rsl = a.distance3d(b);
        double expected = 145;
        assertThat(rsl, is(expected));
    }

}