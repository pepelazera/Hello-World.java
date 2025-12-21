package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Rent rent = new Rent();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.print("How many rooms will be rented ? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Rent #"+i+":");

            System.out.print("Name: ");
            sc.nextLine();
            rent.setName(sc.nextLine());

            System.out.print("Email: ");
            rent.setEmail(sc.next());

            System.out.print("Room: ");
            rent.setRoomNumber(sc.nextInt());

            rooms[rent.getRoomNumber()] = new Rent(rent.getName(), rent.getEmail(), rent.getRoomNumber());
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i<10; i++) {
            if (rooms[i] != null) {
                System.out.println(i+": "+rooms[i]);
            }
        }

        sc.close();
    }
}
