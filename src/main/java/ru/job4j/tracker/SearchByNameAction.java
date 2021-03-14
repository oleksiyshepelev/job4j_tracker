package ru.job4j.tracker;

public class SearchByNameAction implements UserAction{

    private final Output out;

    public SearchByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String theName = input.askStr("Please enter the name: ");
        Item[] itemByName = tracker.findByName(theName);
        if (itemByName.length > 0) {
            for (int i = 0; i < itemByName.length; i++) {
                out.println(itemByName[i]);
            }
        } else {
            out.println("The item with this name was not found.");
        }
        return true;
    }
}
