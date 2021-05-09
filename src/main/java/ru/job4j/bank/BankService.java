package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            if (!accountList.contains(account)) {
                accountList.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().contains(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        List<Account> accounts = users.get(user);
        for (Account account : accounts) {
            if (account.getRequisite().equals(requisite)) {
                return account;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {

        }
        /*
        Метод для перечисления денег с одного счёта на другой счёт.
        Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят),
        то метод должен вернуть false.
         */
        return rsl;
    }

    /*
    Посмотрите на методы Map.putIfAbsent и List.contains, как их можно применить в этом задании.
    Метод putIfAbsent позволяет проверить, если ли такой ключ в карте или нет и если его нет,
    то произвести вставку данных.
    Этот метод позволяет уменьшить количество кода.
    Метод List.indexOf позволяет найти индекс элемента по значению.
    Проверка элементов в этом методе происходит по методу equals.
    Обратите внимание, что в моделях User и Account используется
    только одно поле passport и requisite для сравнения объектов.
    Это позволяет использовать эти методы, без информации о всех полях.
     */
}