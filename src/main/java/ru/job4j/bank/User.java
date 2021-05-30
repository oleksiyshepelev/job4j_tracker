package ru.job4j.bank;

import java.util.Objects;

/**
 * Описание модели пользователя банка.
 * Это модель содержит поля: номер паспорта и ФИО.
 *
 * @author OKEKSIY SHEPELEV
 * @version 1.0
 */
public class User {
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * В данном методе используется уникальное поле passport
     *
     * @return {@code int}
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}