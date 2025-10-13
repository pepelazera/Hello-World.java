package aulasjavapoo;
import java.util.Scanner;
import java.util.Random;

public class Object10_Student extends Object10_Person{
    Scanner sc = new Scanner(System.in);
    Random random = new Random();


    // Attributes
    private int registration;
    private boolean registered;
    private String course;


    // Methods
    public void Registration() {
        while (true) {
            System.out.print("Are you already enrolled in college ? ");
            String ans = sc.next().toUpperCase();
            int min = 100000;
            int max = 999999;

            if (ans.equals("YES") || ans.equals("YY") || ans.equals("YS") || ans.equals("Y")) {
                setRegistered(true);
                this.setRegistration((random.nextInt(max - min + 1) + min));

                System.out.println("You are already a student, great!\n");

                System.out.println("=== STATUS STUDENT ===");
                System.out.println("Name: "+this.getName());
                System.out.println("Age: "+this.getAge());
                System.out.println("Gender: "+this.getGender());
                System.out.println("\nRegistration number: "+this.getRegistration());
                System.out.println("Enrolled: "+this.getRegistered());
                System.out.println("Course: "+this.getCourse());

                sc.close();
                break;

            } else if (ans.equals("NO") || ans.equals("N") || ans.equals("NN")){
                System.out.print("Do you want to enroll ? ");
                String ans2 = sc.next().toUpperCase();

                System.out.print("Wha course do you want to enroll ? ");
                sc.nextLine();
                this.setCourse(sc.nextLine());

                if (ans2.equals("YES") || ans2.equals("YY") || ans2.equals("YS") || ans2.equals("Y")) {
                    this.setRegistration((random.nextInt(max - min + 1) + min));


                    System.out.println("\nWelcome!");
                    this.setRegistered(true);

                    thePerson();

                    System.out.println("\n=== STATUS NEW STUDENT ===");
                    System.out.println("Name: "+this.getName());
                    System.out.println("Age: "+this.getAge());
                    System.out.println("Gender: "+this.getGender());
                    System.out.println("Registration number: "+this.getRegistration());
                    System.out.println("Enrolled: "+this.getRegistered());
                    System.out.println("Course: "+this.getCourse());

                    break;

                } else if (ans2.equals("NO") || ans2.equals("N") || ans2.equals("NN")) {
                    this.setRegistered(false);
                    System.out.println("Okay, thanks!");
                    break;

                }else {
                    System.out.println("ERROR: Please, answer with 'yes' or 'no'.");
                }

                sc.close();
            }

            else {
                System.out.println("ERROR: Please, answer with 'yes' or 'no'.");
            }

        }

        sc.close();

    }


    public void cancelRegistration() {
        while (true) {
            System.out.print("Do you want to cancel your registration ? ");
            String ans = sc.next().toUpperCase();

            if (ans.equals("YES") || ans.equals("YY") || ans.equals("Y")) {
                this.setRegistered(false);

                System.out.println("Your registration has been removed");
                break;
            }
            else if (ans.equals("NO") || ans.equals("NN") || ans.equals("N")) {
                this.setRegistered(true);

                System.out.println("Great! You are still enrolled.");
                break;
            }
            else {
                System.out.println("ERROR: Please, answer with 'yes' or 'no': ");

            }
        }

        sc.close();

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
