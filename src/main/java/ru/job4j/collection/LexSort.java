package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] lesfStr = left.split(". ");
        String[] rightStr = right.split(". ");
        return Integer.compare(Integer.parseInt(lesfStr[0]),
                Integer.parseInt(rightStr[0]));
    }
}