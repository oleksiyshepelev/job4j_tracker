package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNlessThan0Calc() {
        new Fact().calc(-2);
    }
}