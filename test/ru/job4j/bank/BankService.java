package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        List<Account> accounts = users.get(findByPassport(passport));
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
        users.put(findByPassport(passport), accounts);
    }

    public User findByPassport(String passport) {
        for (User u: users.keySet()) {
            if (u.getPassport().equals(passport)) {
                return u;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null) {
            List<Account> accounts = users.get(findByPassport(passport));
            for (Account a : accounts) {
                if (a.getRequisite().contains(requisite)) {
                    return a;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        if (findByPassport(srcPassport) != null || findByPassport(destPassport) != null
        || findByRequisite(srcPassport, srcRequisite) != null || findByRequisite(destPassport, destRequisite) != null
        || findByRequisite(srcPassport, srcRequisite).getBalance() < amount) {
            double balancesrs = findByRequisite(srcPassport, srcRequisite).getBalance();
            double balancedest = findByRequisite(destPassport, destRequisite).getBalance();
            findByRequisite(srcPassport, srcRequisite).setBalance(balancesrs - amount);
            findByRequisite(destPassport, destRequisite).setBalance(balancedest + amount);
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}
