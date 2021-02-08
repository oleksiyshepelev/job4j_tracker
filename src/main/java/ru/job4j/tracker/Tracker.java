package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] rsl = new Item[items.length];
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                rsl[count] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = (index != -1);
        if (rsl) {
            items[index] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        int length = size - index;
        boolean rsl = (index != -1);
        if (rsl) {
            System.arraycopy(items, index + 1, items, index, length);
            items[size--] = null;
            size--;
        }
        return rsl;
    }
}