package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] lesfStr = left.split(". ");
        String[] rightStr = right.split(". ");
        for (int i = 0; i < 1; i++) {
            if (Integer.parseInt(lesfStr[i]) != Integer.parseInt(rightStr[i])) {
                return Integer.compare(Integer.parseInt(lesfStr[i]),
                        Integer.parseInt(rightStr[i]));
            }
        }
        return 0;
    }
}