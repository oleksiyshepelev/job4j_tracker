package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class ByPriorityDescTest {
    // 4 - по приоритету и по убыванию
    @Test
    public void whenCompareByPriorityDesc() {
        Comparator<Job> comPriorityDesc = new ByNameDesc();
        int rsl = comPriorityDesc.compare(
                new Job("A task", 0),
                new Job("B task", 1));
        assertThat(rsl, greaterThan(0));
    }
}