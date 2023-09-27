package ro.sda._3_exceptions._2_exercise;
/*
    Create an Account class with tho following:
    - iban (String): a private field representing the unique identifier of the account.
    - accountName (String): a private field representing the name of the account.
    - balance (double): a private field representing the current balance in the account.
    - a constructor that initialize all the fields
    - getIban(): a method that returns the account IBAN.
    - getAccountName(): a method that returns the account name.
    - getBalance(): a method that returns the current balance in the account.
    - deposit(double amount): a method that takes in a double representing the amount to be deposited,
              and adds it to the balance. Throws an IllegalArgumentException if the amount is negative.
    - withdraw(double amount): a method that takes in a double representing the amount to be withdrawn,and subtracts it
              from the balance. Throws an IllegalArgumentException if the amount is negative, and an
              InsufficientBalanceException if the balance is insufficient.
    Create a Bank class -> A class representing a bank that can store and manage multiple accounts.
    - the class contains a List of Account objects.
    - has a constructor that initializes an empty ArrayList for accounts.
    - addAccount(Account account): a method that takes in an Account object and adds it to the list of accounts.
    - deposit(int accountId, double amount): a method that takes in an int representing the account ID and a double representing the amount to deposit, finds the Account object with the given ID and deposits the amount to the account. If the account is not found, it throws an InvalidAccountException.
    - withdraw(int accountId, double amount): a method that takes in an int representing the account ID and a double representing the amount to withdraw, finds the Account object with the given ID and withdraws the amount from the account. If the account is not found, it throws an InvalidAccountException. If the balance is insufficient, it throws an InsufficientBalanceException.
    - findAccount(int accountId): a private helper method that takes in an int representing the account ID and returns the Account object with the given ID if it exists in the list of accounts. If the account is not found, it returns null.
*/



public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("12", "Marius", 120);
        Account account2 = new Account("13", "Alexia", 140);
        Account account3 = new Account("14", "Razvan", 300);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        //It throws unchecked exception, so we are not forced to handle it at compile time
        bank.deposit("Marius",200);
        try {
            bank.deposit("Catalin",120);
        }catch (InvalidAccountException ex){
            System.out.println("Inside first catch");
            System.out.println(ex.getMessage());
        }
        try {
            bank.deposit("Alexia",-220);
        }catch (IllegalArgumentException ex){
            System.out.println("Inside second catch");
            System.out.println(ex.getMessage());
        }
        //because withdraw throws a checked exception, we cannot
        //compile the code without handling the exception with try-catch
        try {
            bank.withdraw("Marius",50);
        }catch (InsufficientBalanceException ex){
            System.out.println("Inside third catch");
            System.out.println(ex.getMessage());
        }
    }
}