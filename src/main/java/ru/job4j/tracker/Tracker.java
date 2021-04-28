package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(size, item);
        size++;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (Item index : items) {
            if (index.getId() == id) {
                return items.indexOf(index);
            }
        }
        return rsl;
    }

    public List<Item> findAll() {
        return new ArrayList<>(items);
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (Item index : items) {
            if (index.getName().equals(key)) {
                rsl.add(index);
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = (index != -1);
        if (rsl) {
            items.remove(index);
            items.add(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = (index != -1);
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
}