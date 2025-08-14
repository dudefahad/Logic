// // /*7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer. */

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Bank {
//     private String name;
//     private int accountNumber;
//     private double balance;

//     public Bank(int accountNumber, double balance, String name) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         this.name = name;
//     }

    

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAccountNumber() {
//         return accountNumber;
//     }

//     public void setAccountNumber(int accountNumber) {
//         this.accountNumber = accountNumber;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void setBalance(double balance) {
//         this.balance = balance;
//     }



//     @Override
//     public String toString() {
//         return "Bank [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
//     }

//     public double deposit(double amount){
//         balance+=amount;
//         return balance;
//     }

//     // public double withdraw(double amount){
//     //     balance-=amount;
//     //     return balance;

//     // }

//     public double withdraw(double amount) {
//     if (amount == 0) {
//         System.out.println("❌ Withdrawal amount must be greater than 0 for " + name);
//     } else if (amount > 0 && balance >= amount) {
//         balance -= amount;
//         System.out.println("✅ Withdrawal of " + amount + " successful for " + name);
//     } else {
//         System.out.println("❌ Withdrawal failed for " + name + ": Insufficient balance.");
//     }
//     return balance;
// }

    
//         public static void main(String[] args) {

//             Scanner sc = new Scanner(System.in);
//             ArrayList <Bank> al= new ArrayList<>();
//             do {

//             }while (true) { 
                
//             }



//  //-------------------------------------------------------------------------------------------------------
// //             Bank acc1= new Bank(101, 30000, "ameer");
// //             Bank acc2= new Bank(102, 38000, "kumatr");
// //             Bank acc3= new Bank(103, 90000, "fahad");

// //             ArrayList<Bank> al= new ArrayList<>();
// //             al.add(acc1);
// //             al.add(acc2);
// //             al.add(acc3);

// //             // System.out.println(al);
// //             for (Bank obj:al){
// //                 System.out.println(obj);
// //             }

// //             // doing deposit and withdrawl
// //             acc1.deposit(2000);
// //             acc3.withdraw(50000);
    

// //             System.out.println("New balances after operation : ");
// //             // System.out.println(al);
// //              for (Bank obj:al){
// //                 System.out.println(obj);
// //             }

//    }

// }
//-----------------------------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private String name;
    private int accountNumber;
    private double balance;

    public Bank(int accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public String getName() { return name; }
    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited ₹" + amount + " to " + name);
        } else {
            System.out.println("❌ Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount == 0) {
            System.out.println("❌ Withdrawal amount must be greater than 0.");
        } else if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("✅ Withdrawal of ₹" + amount + " successful for " + name);
        } else {
            System.out.println("❌ Insufficient balance for " + name);
        }
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber + ", Name: " + name + ", Balance: ₹" + balance;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bank> accounts = new ArrayList<>();

        System.out.print("How many bank accounts do you want to create? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Account " + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Initial Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine(); // consume newline

            Bank newAccount = new Bank(accNo, bal, name);
            accounts.add(newAccount);

            System.out.println(" Account created successfully!");
        }

        int choice;
        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. View All Accounts");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Account Details ---");
                    for (Bank acc : accounts) {
                        System.out.println(acc);
                    }
                }

                case 2 -> {
                    System.out.print("Enter account number to deposit into: ");
                    int accNoDeposit = sc.nextInt();
                    Bank depositAcc = findAccount(accounts, accNoDeposit);
                    if (depositAcc != null) {
                        System.out.print("Enter amount to deposit: ₹");
                        double depositAmount = sc.nextDouble();
                        depositAcc.deposit(depositAmount);
                    } else {
                        System.out.println("❌ Account not found.");
                    }
                }

                case 3 -> { 
                    System.out.print("Enter account number to withdraw from: ");
                    int accNoWithdraw = sc.nextInt();
                    Bank withdrawAcc = findAccount(accounts, accNoWithdraw);
                    if (withdrawAcc != null) {
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdrawAmount = sc.nextDouble();
                        withdrawAcc.withdraw(withdrawAmount);
                    } else {
                        System.out.println("❌ Account not found.");
                    }
                }

                case 4 -> System.out.println("👋 Exiting. Thank you for using the bank!");

                default -> System.out.println("❌ Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    // Helper to find an account by account number
    public static Bank findAccount(ArrayList<Bank> list, int accNo) {
        for (Bank b : list) {
            if (b.getAccountNumber() == accNo) {
                return b;
            }
        }
        return null;
    }
}
