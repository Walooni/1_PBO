package Praktikum_3_tugas_tambahan;

public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal
  
    public BankAccount(double initialBalance) {
        if (initialBalance < MIN_BALANCE){
        }
        this.balance = initialBalance;
    }
  
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
  
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount > balance-MIN_BALANCE) {
            throw new InsufficientFundsException();
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }
  
    public double getBalance() {
        return balance;
    }
  }
  