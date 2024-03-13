package Praktikum_3_tugas_tambahan;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Saldo ga cukup bro...");
    }

}
