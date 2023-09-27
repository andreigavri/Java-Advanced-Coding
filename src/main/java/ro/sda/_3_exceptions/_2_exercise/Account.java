package ro.sda._3_exceptions._2_exercise;

/* Create an Account class with tho following:
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
        */
public class Account {
    private String iban;
    private String accountName;
    private double balance;
    public Account(String iban, String accountName, double balance) {
        this.iban = iban;
        this.accountName = accountName;
        this.balance = balance;
    }
    public String getIban() {
        return iban;
    }
    public String getAccountName() {
        return accountName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("The deposited amount can not be negative! ");
        }
        balance += amount;

    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount < 0){
            throw new IllegalArgumentException("The deposited amount can not be negative! ");
        }
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
    }
}