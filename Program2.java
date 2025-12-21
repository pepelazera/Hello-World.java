package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent2 rent = new Rent2();

        Rent2[] rooms2 = new Rent2[10];

        System.out.print("How many rooms will be rented ? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Rent #"+i);

            System.out.print("Name: ");
            sc.nextLine();
            rent.setName(sc.nextLine());

            System.out.print("Email: ");
            rent.setEmail(sc.next());

            System.out.print("Room: ");
            rent.setRoomNumber(sc.nextInt());

            rooms2[rent.getRoomNumber()] = new Rent2(rent.getName(), rent.getEmail(), rent.getRoomNumber());
        }

        System.out.println();
        for (int i=0; i<10; i++) {
            if (rooms2[i] != null) {
                System.out.println(i+": "+rooms2[i]);
            }
        }

        sc.close();
    }
}
