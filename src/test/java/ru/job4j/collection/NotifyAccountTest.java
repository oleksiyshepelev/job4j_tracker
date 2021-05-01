package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sentWhenDif() {
        List<Account> accounts = Arrays.asList(
                new Account(
                        "12345",
                        "Petr Arsentev",
                        "eDer3432f"),
                new Account(
                        "54321",
                        "Petr Arsentev",
                        "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account(
                                "12345",
                                "Petr Arsentev",
                                "eDer3432f"),
                        new Account(
                                "54321",
                                "Petr Arsentev",
                                "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sentWhenEqual() {
        List<Account> accounts = Arrays.asList(
                new Account(
                        "12345",
                        "Petr Arsentev",
                        "eDer3432f"),
                new Account(
                        "12345",
                        "Petr Arsentev",
                        "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account(
                                "12345",
                                "Petr Arsentev",
                                "eDer3432f"),
                        new Account(
                                "12345",
                                "Petr Arsentev",
                                "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}