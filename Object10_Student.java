package aulasjavapoo;
import java.util.Scanner;
import java.util.Random;

public class Object10_Student extends Object10_Person{
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    Object10_Person Person = new Object10_Person();

    // Attributes
    private int registration;
    private boolean registered;
    private String course;

    public void Registration() {
        while (true) {
            System.out.print("Are you already enrolled in school ? ");
            String ans = sc.next().toUpperCase();
            int min = 100000;
            int max = 999999;

            if (ans.equals("YES") || ans.equals("YY") || ans.equals("YS") || ans.equals("Y")) {
                setRegistered(true);
                this.setRegistration((random.nextInt(max - min + 1) + min));

                System.out.println("You are already a student, great!");
                System.out.println("Registration number: " + getRegistration());
                System.out.println("Situation: " + this.getRegistered());
                break;

            } else if (ans.equals("NO") || ans.equals("N") || ans.equals("NN")){
                System.out.print("Do you want to enroll ? ");
                String ans2 = sc.next().toUpperCase();

                if (ans2.equals("YES") || ans2.equals("YY") || ans2.equals("YS") || ans2.equals("Y")) {
                    this.setRegistration((random.nextInt(max - min + 1) + min));


                    System.out.println("\nWelcome!");
                    this.setRegistered(true);

                    thePerson();
                    System.out.println("\n=== STATUS NEW STUDENT ===");
                    System.out.println("Name: " + getName());
                    System.out.println("Age: " + getAge());
                    System.out.println("Gender: " + getGender());
                    System.out.println("Registration number: " + this.getRegistration());
                    System.out.println("Situation: " + this.getRegistered());
                    break;

                } else if (ans2.equals("NO") || ans2.equals("N") || ans2.equals("NN")) {
                    this.setRegistered(false);
                    System.out.println("Okay, thanks!");
                    break;

                }else {
                    System.out.println("ERROR: Please, answer with 'yes' or 'no'.");
                    continue;
                }
            }

            else {
                System.out.println("ERROR: Please, answer with 'yes' or 'no'.");
                continue;
            }

        }

    }

    // Methods
    public void cancelRegistration() {
        System.out.print("Do you want to cancel your registration ? ");

    }


    // Special Methods
    public int getRegistration() {
        return registration;
    }
    public void setRegistration(int registration) {
        this.registration = registration;
    }


    public boolean getRegistered() {
        return registered;
    }
    public void setRegistered(boolean registered) {
        this.registered = registered;
    }


    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}
