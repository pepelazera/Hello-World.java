package Aplications;

import Entities.Manager;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Invites extends Manager {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        while (true) {
            System.out.print("Put the name (Write 'end' to finish program): ");
            manager.setName(sc.nextLine());

            if (manager.getName().equalsIgnoreCase("end")) {
                break;
            }

            names.add(manager.getName());
        }

        System.out.println();
        System.out.println("Guest listed by first come: " + names);
        Collections.sort(names);
        System.out.println("Guest listed by names: " + names);
        System.out.println("Total of guests: " + names.size());

        sc.close();
    }
}
