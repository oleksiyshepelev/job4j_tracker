package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftInt = left.length();
        int rightInt = right.length();
        int size = Math.min(leftInt, rightInt);
        for (int i = 0; i < size; i++) {
            int firstCh = left.charAt(i);
            int secondCh = right.charAt(i);
            if (firstCh != secondCh) {
                return firstCh - secondCh;
            }
        }
        if (leftInt != rightInt) {
            return leftInt - rightInt;
        } else {
            return 0;
        }
    }
}
