package oop;

public class BankAccountExample {

    private String accountNumber;
    private double balance;

    public BankAccountExample(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("El producto depositado es: " + amount + ". Saldo actual: " + balance);
        } else  {
            System.out.println("La cantidad depositada tiene que ser positiva");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("La cantidad retirada debe ser positiva");
        } else if (amount > balance) {
            System.out.println("Saldo insuficiente. Saldo actual: " + balance);
        } else  {
            balance -= amount;
            System.out.println("Retirada realizada de: " + amount + ". Saldo actual: " + balance);
        }
    }
}
