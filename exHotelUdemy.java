package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exHotelUdemy {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int[] rooms = new int[9];

        System.out.print("How many rooms will be rented ? ");
        n = sc.nextInt();

        String[] names = new String[n];
        String[] emails = new String[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Rent # %s\n", i+1);

            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();

            System.out.print("Email: ");
            emails[i] = sc.next();

            System.out.print("Room: ");
            rooms[i] = sc.nextInt();
        }

        System.out.println("Busy rooms: ");
        for (int i=0; i<n; i++) {
            System.out.printf("%s: %s, %s\n", rooms[i], names[i], emails[i]);
        }
        
        sc.close();
    }
}

