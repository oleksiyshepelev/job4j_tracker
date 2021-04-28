package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {

    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ===");
        //Item[] allItems = tracker.findAll();
        List<Item> allItems = tracker.findAll();
        if (allItems.size() > 0) {
            for (Item i: allItems) {
                out.println(i);
            }
            /*for (int i = 0; i < allItems.length; i++) {
                out.println(allItems[i]);
            }*/
        } else {
            out.println("There are no items yet");
        }
        return true;
    }
}
