package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftInt = left.length();
        int rightInt = right.length();
        int size = Math.min(leftInt, rightInt);
        for (int i = 0; i < size; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return Character.compare(left.charAt(i), right.charAt(i));
            }
        }
        return Integer.compare(leftInt, rightInt);
    }
}
