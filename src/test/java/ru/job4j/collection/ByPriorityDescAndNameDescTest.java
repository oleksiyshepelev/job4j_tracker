package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class ByPriorityDescAndNameDescTest {
    @Test
    public void whenComparatorByPriorityAndNameDesc() {
        Comparator<Job> cmp = new ByPriorityDesc().thenComparing(
                new ByNameDesc());
        int rsl = cmp.compare(
                new Job("A task", 0),
                new Job("B task", 0)
        );
        assertThat(rsl, greaterThan(0));
        System.out.println(rsl);
    }
}
