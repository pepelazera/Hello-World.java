package ex001_UdemyAcademy;

import java.util.Scanner;

public class BankAccount {
    // Attributes
    private int numAccount;
    private String nameAccount;
    private float initialValueDeposited;
    private float bankFee;
    private float accountBalance;
    private float depositValue;
    private float withdrawValue;
    private boolean accountStatus;


    // Methods
    public void creatAccount() {

    }

    public void increaseBalance() {

    }

    public void AccountInitialized() {
        Scanner sc = new Scanner(System.in);
        int ans;
        System.out.println();

        while (true) {
            System.out.println("--- Lazera's Bank ---");
            System.out.println("[1] Create Account");
            System.out.println("[2] Close Account");
            System.out.println("[3] Deposit Value");
            System.out.println("[4] Withdraw Value");
            System.out.println("[5] Finish Service");

            System.out.print("\nChoose an action: ");
            ans = sc.nextInt();

            if (ans == 1) {
                System.out.print("\nAccount number: ");
                this.setNumAccount(sc.nextInt());

                System.out.print("Account owner's name: ");
                this.setNameAccount(sc.nextLine());
                this.setNameAccount(sc.nextLine());

                System.out.print("Value to be deposited: ");
                this.setAccountBalance(sc.nextFloat());

                this.setAccountStatus(true);


                System.out.println("/n---Account Information ---");
                System.out.printf("\n- Account Number: %s", this.getNumAccount());
                System.out.printf("\n- Account Owner: %s", this.getNameAccount());
                System.out.printf("\n- Balance: U$ %s",this.getAccountBalance());
                System.out.println("\n");
            }

            else if (ans == 2) {
                while (true) {
                    System.out.println("Let's close your account...");
                    System.out.println("Account number: ");
                    int newAccountNumber = sc.nextInt();

                    if (newAccountNumber != this.getNumAccount()) {
                        System.out.println("ERROR: Number account is incorrect.");
                        break;
                    }

                    else if (newAccountNumber == this.getNumAccount()) {
                        this.setAccountStatus(false);

                        System.out.println("Your account is closed with success.");
                        System.out.printf("/nAccount status: %s", this.getAccountStatus());
                        break;
                    }

                    else {
                        System.out.println("ERROR: Please, write you number account to close it.");
                    }
                }
            }

            else if (ans == 3) {
                while (true) {
                    System.out.print("Put how much do you want to deposite: ");
                    this.setDepositValue(sc.nextFloat());

                    if (this.getDepositValue() <= 0) {
                        System.out.println("ERROR: It's impossible deposit 0 dollars or less (negative value.");
                        System.out.println("Please, write an acceptable value ");
                    }

                    else {
                        System.out.printf("\nValue deposited: U$ %s", this.getDepositValue());

                        this.setInitialValueDeposited(this.getInitialValueDeposited() + this.getDepositValue());
                        System.out.printf("\nNow, your balance is: U$ %s", this.getInitialValueDeposited());
                        break;
                    }
                }
            }

            else if (ans == 4) {
                while (true) {
                    System.out.println("Put how much do you want to withdraw: ");
                    float sakeValue = sc.nextFloat();

                    if (sakeValue > this.getAccountBalance()) {
                        this.setAccountBalance(this.getAccountBalance() - sakeValue);

                        System.out.println("Your balance will be negative...");
                        System.out.printf("\nAccount balance now: U$ %s", this.getAccountBalance());
                        break;
                    }

                    else if (sakeValue <= this.getAccountBalance()) {
                        this.setAccountBalance(this.getAccountBalance() - sakeValue);

                        System.out.printf("\nAccount balance now: U$ %s", this.getAccountBalance());
                        break;
                    }

                    else {
                        System.out.println("ERROR: Please, put how much do you want to withdraw ");
                    }
                }
            }

            else if (ans == 5) {
                System.out.println("Finish program...");
                break;
            }
        }
        sc.close();
    }

    // Getters and Setters
    public int getNumAccount() {
        return numAccount;
    }
    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }


    public String getNameAccount() {
        return nameAccount;
    }
    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }


    public float getInitialValueDeposited() {
        return initialValueDeposited;
    }
    public void setInitialValueDeposited(float initialValueDeposited) {
        this.initialValueDeposited = initialValueDeposited;
    }


    public float getBankFee() {
        return bankFee;
    }
    public void setBankFee(float bankFee) {
        this.bankFee = bankFee;
    }


    public float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }


    public float getDepositValue() {
        return depositValue;
    }
    public void setDepositValue(float depositValue) {
        this.depositValue = depositValue;
    }


    public float getWithdrawValue() {
        return withdrawValue;
    }
    public void setWithdrawValue(float withdrawValue) {
        this.withdrawValue = withdrawValue;
    }


    public boolean getAccountStatus() {
        return accountStatus;
    }
    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
}
