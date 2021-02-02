package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirst70Second3() {
        int result = Max.max(70, 3);
        assertThat(result, is(70));
    }

    @Test
    public void whenFirst1Second8Third9() {
        int result = Max.max(1, 8, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenFirst8Second10Third3Four55() {
        int result = Max.max(8, 10, 3, 55);
        assertThat(result, is(55));
    }
}