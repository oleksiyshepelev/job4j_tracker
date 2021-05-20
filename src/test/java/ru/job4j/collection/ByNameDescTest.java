package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class ByNameDescTest {
    // 3 - по имени и по убыванию
    @Test
    public void whenCompareByNameDesc() {
        Comparator<Job> comNameDesc = new ByNameDesc();
        int rsl = comNameDesc.compare(
                new Job("A task", 0),
                new Job("B task", 1));
        assertThat(rsl, greaterThan(0));
    }
}