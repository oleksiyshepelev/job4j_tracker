package ru.job4j.tracker;

public class SearchByNameAction implements UserAction{
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String theName = input.askStr("Please enter the name: ");
        Item[] itemByName = tracker.findByName(theName);
        if (itemByName.length > 0) {
            for (int i = 0; i < itemByName.length; i++) {
                System.out.println(itemByName[i]);
            }
        } else {
            System.out.println("The item with this name was not found.");
        }
        return true;
    }
}
