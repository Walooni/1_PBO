package Praktikum_3_tugas_tambahan;

public class BankApp {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000.0);

        try {
            // skenario saldo mencukupi
            account.withdraw(500.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());
    
            // skenario saldo tidak mencukupi
            account.withdraw(1000.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.println("saldo saat ini :" + account.getBalance());
        }
        account.deposit(100);
        System.out.println("saldo saat ini :" + account.getBalance());
    }
  }
  
