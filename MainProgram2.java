package ex001_Correcao;
import java.util.Scanner;


public class MainProgram2 {
    public static void main(String[] args) {

        // Imports
        Scanner sc = new Scanner(System.in);
        BankAccount2 account;


        // Creating account
        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is ther an initial deposit ? (y/n): ");
        char response = sc.next().charAt(0);

        if (response == 'y') {

            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount2(number, holder, initialDeposit);

        } else {

            account = new BankAccount2(number, holder);

        }


        // Put the information on the terminal
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);


        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);


        System.out.println("\nUpdated account data: ");
        System.out.println(account);


        System.out.println();


        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated account data: ");
        System.out.println(account);


        sc.close();
    }
}
