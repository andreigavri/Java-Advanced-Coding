package ro.sda._3_exceptions._2_exercise;

/*
Create a Bank class -> A class representing a bank that can store and manage multiple accounts.
    - the class contains a List of Account objects.
    - has a constructor that initializes an empty ArrayList for accounts.
    - addAccount(Account account): a method that takes in an Account object and adds it to the list of accounts.
    - deposit(int accountId, double amount): a method that takes in an int representing the account ID and a double representing the amount to deposit, finds the Account object with the given ID and deposits the amount to the account. If the account is not found, it throws an InvalidAccountException.
    - withdraw(int accountId, double amount): a method that takes in an int representing the account ID and a double representing the amount to withdraw, finds the Account object with the given ID and withdraws the amount from the account. If the account is not found, it throws an InvalidAccountException. If the balance is insufficient, it throws an InsufficientBalanceException.
    - findAccount(int accountId): a private helper method that takes in an int representing the account ID and returns the Account object with the given ID if it exists in the list of accounts. If the account is not found, it returns null.
 */

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountsList;
    public Bank() {
        this.accountsList = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accountsList.add(account);
    }
    public Account findAccount(String accountName) {
        for (Account a : accountsList) {
            if (a.getAccountName().equals(accountName)) {
                return a;
            }
        }
        return null;
    }
    public void withdraw(String accountName, double amount) throws InsufficientBalanceException {
        Account account = findAccount(accountName);
        if (account == null) {
            throw new InvalidAccountException("Account not found ! ");
        }
        account.withdraw(amount);
    }
    public void deposit(String accountName, double amount) {
        Account account = findAccount(accountName);
        if (account == null) {
            throw new InvalidAccountException("Account not found ! ");
        }
        account.deposit(amount);
    }
}

