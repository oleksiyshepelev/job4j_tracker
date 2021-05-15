package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DescendSortItemTest {

    @Test
    public void compare() {
        DescendSortItem descendSortItem = new DescendSortItem();
        List<Item> current = new ArrayList<>();
        current.add(new Item(1, "a"));
        current.add(new Item(2, "b"));
        current.add(new Item(3, "c"));
        List<Item> expected = new ArrayList<>(current);
        Collections.reverse(current);
        Collections.sort(expected, descendSortItem);
        assertThat(current, is(expected));
    }
}