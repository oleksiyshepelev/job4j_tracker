package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class ByNameAsceTest {
    //1 - по имени и по возрастанию
    @Test
    public void whenCompareByNameAsce() {
        Comparator<Job> comNameAsce = new ByNameAsce();
        int rsl = comNameAsce.compare(
                new Job("A task", 0),
                new Job("B task", 0));
        assertThat(rsl, lessThan(0));
    }
}