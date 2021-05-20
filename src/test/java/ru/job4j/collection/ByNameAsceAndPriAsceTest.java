package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class ByNameAsceAndPriAsceTest {
    @Test
    public void whenComparatorByNameAndProrityAsce() {
        Comparator<Job> cmp = new ByNameAsce().thenComparing(
                new ByPriorityAsce());
        int rsl = cmp.compare(
                new Job("A task", 0),
                new Job("A task", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}
