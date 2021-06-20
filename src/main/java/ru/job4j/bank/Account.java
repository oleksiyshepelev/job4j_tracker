package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описываете модель банковского счёта.
 * Эта модель содержит поля: баланс и реквизиты.
 *
 * @author OLEKSIY SHEPELEV
 * @version 1.0
 */
public class Account {
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Данный метод сгенерирован автоматически IDEA
     *
     * @return {@code true} or {@code false}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * В данном методе используется уникальное поле requisite
     *
     * @return {@code int}
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}