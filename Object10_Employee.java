package aulasjavapoo;
import java.util.Scanner;

public class Object10_Employee extends Object10_Person {
    Scanner sc = new Scanner(System.in);

    // Attributes
    private String work;
    private boolean working;


    // Methods
    public void currentWork() {
        System.out.print("What is your current work ? ");
        this.setWork(sc.nextLine());

        thePerson();

        System.out.println("\n=== STATUS EMPLOYEE ===");
        System.out.println("Name: "+this.getName());
        System.out.println("Age: "+this.getAge());
        System.out.println("Gender: "+this.getGender());
        System.out.println("Work: "+this.getWork());
    }
    public void changeWork() {
        while (true) {
            System.out.print("Do you want to change your job ? ");
            String ans = sc.nextLine().toLowerCase();

            if (ans.equals("yes") || ans.equals("yy") || ans.equals("y")) {

                System.out.print("Which work do you want to do now ? ");
                this.setWork(sc.nextLine());

                System.out.println("\n=== STATUS EMPLOYEE UPDATED ===");
                System.out.println("Name: " + this.getName());
                System.out.println("Age: " + this.getAge());
                System.out.println("Gender: " + this.getGender());
                System.out.println("Work: " + this.getWork());
                break;

            }

            else if (ans.equals("no") || ans.equals("nn") || ans.equals("n")) {

                System.out.println("Understand. We didn't change nothing.");
                break;

            }

            else {
                System.out.println("ERROR: Please, write 'yes' or 'no' to continue: ");
            }

        }
    }


    // Special methods
    public String getWork() {
        return work;
    }
    public void setWork(String sector) {
        this.work = sector;
    }


    public boolean isWorking() {
        return working;
    }
    public void setWorking(boolean working) {
        this.working = working;
    }


}
