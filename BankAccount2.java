package ex001_Correcao;

public class BankAccount2 {

    private int number;
    private String holder;
    private double balance;


    // Methods
    public BankAccount2 (int number, String holder) {

        this.number = number;
        this.holder = holder;

    }


    public BankAccount2 (int number, String holder, double initialDeposit) {

        this.number = number;
        this.holder = holder;
        this.deposit(initialDeposit);

    }


    public void deposit(double amount) {

        this.balance += amount;

    }


    public void withdraw(double amount) {

        this.balance -= amount + 5.0;

    }


    // Getters and Setters
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }


    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }


    public double getBalance() {
        return balance;
    }


    public String toString() {

        return  "----- Account Information -----"
                + "\nAccount: "
                + number
                + "\nHolder: "
                + holder
                + "\nBalance: U$ "
                + String.format("%.2f", balance)
                + "\n--------------------------------";

    }
}
