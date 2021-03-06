package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenFirstX0FirstY0SecondX0SecondY10distanceIs10() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        assertThat(result, is(10.0));
    }

    @Test
    public void whenFirstX0Y0Z0SAndSecondX2Y2Z2() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(2, 2, 2);
        double result = first.distance3d(second);
        assertEquals(result, 3.464, 0.1);
    }
}