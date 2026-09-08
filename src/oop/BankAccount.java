package oop;

public class BankAccount {

    Double balance;
    Double balance1;

    public BankAccount(Double balance, Double balance1) {
        this.balance = balance;
        this.balance1 = balance1;
    }

    public void deposit() {
        System.out.println("Usted ha depositado en el banco la cantidad de " + balance + " más la cantidad de " + balance1);
        System.out.println("Usted ha depositado en total en el banco " + (balance + balance1));
    }
}
