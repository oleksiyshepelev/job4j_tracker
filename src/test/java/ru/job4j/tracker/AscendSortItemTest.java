package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AscendSortItemTest {

    @Test
    public void compare() {
        AscendSortItem ascendSortItem = new AscendSortItem();
        List<Item> current = new ArrayList<>();
        current.add(new Item(3, "c"));
        current.add(new Item(2, "b"));
        current.add(new Item(1, "a"));
        List<Item> expected = new ArrayList<>(current);
        Collections.sort(current);
        Collections.sort(expected, ascendSortItem);
        assertThat(current, is(expected));
    }
}