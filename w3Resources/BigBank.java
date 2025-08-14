/*
 Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. Include methods for depositing and withdrawing money, as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.
 */

class BankAccount{
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance-=amount;
            System.out.println( "withdrew : "+amount+ ". New Balance : "+ balance);
        }else{
            System.out.println("Invalid withdrawal or insufficient balance.");
        }

    }

    public void checkBalance() {
        System.out.println("Account Balance: ₹" + balance);
    }

    @Override
    public String toString() {
        return "Account No: " + accountNumber + 
               ", Holder: " + accountHolder + 
               ", Balance: ₹" + balance;
    }

    
}

//subclass saving Account

class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountHolder, String accountNumber, double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
    double interest = getBalance() * interestRate / 100;
    setBalance(getBalance() + interest);
    System.out.println("Interest of ₹" + interest + " applied. New Balance: ₹" + getBalance());
}


}


public class BigBank {
    
}
