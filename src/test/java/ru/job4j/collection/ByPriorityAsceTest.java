package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class ByPriorityAsceTest {
    //- по приоритету и по возрастанию
    @Test
    public void whenCompareByPriorityAsce() {
        Comparator<Job> comPrioAsce = new ByPriorityAsce();
        int rsl = comPrioAsce.compare(
                new Job("A task", 0),
                new Job("B task", 1));
        assertThat(rsl, lessThan(0));
    }
}