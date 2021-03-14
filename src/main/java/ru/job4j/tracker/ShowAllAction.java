package ru.job4j.tracker;

public class ShowAllAction implements UserAction{

    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ===");
        Item[] allItems = tracker.findAll();
        if (allItems.length > 0) {
            for (int i = 0; i < allItems.length; i++) {
                out.println(allItems[i]);
            }
        } else {
            out.println("There are no items yet");
        }
        return true;
    }
}
