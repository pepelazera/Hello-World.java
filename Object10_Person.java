package aulasjavapoo;
import java.util.Scanner;

public class Object10_Person {
    Scanner sc = new Scanner(System.in);

    // Attributes
    private String name;
    private int age;
    private String gender;
    private boolean ageDriving;


    // Methods
    public void thePerson() {
        System.out.print("What's your name ? ");
        this.setName(sc.nextLine());

        System.out.print("How old are you ? ");
        this.setAge(sc.nextInt());
        setAgeDriving(this.getAge() >= 16);

        System.out.print("Are you man or woman ? ");
        this.setGender(sc.next());

        sc.close();
    }


    public void haveBirthday() {
        while (true) {
            System.out.print("Today is your birthday ? ");
            String ans = sc.next().toUpperCase();


            if (ans.equals("YES") || ans.equals("Y") || ans.equals("YY") || ans.equals("Ys")) {

                this.setAge(this.getAge() + 1);
                System.out.printf("\nSo, your age is %s now.", this.getAge());
                break;

            } else if (ans.equals("NO") || ans.equals("N") || ans.equals("NN")) {

                System.out.printf("\nYour age is %s.", this.getAge());
                break;

            } else {
                System.out.print("\nERROR: Please, put your age again: ");
                sc.next();
            }
        }
        sc.close();
    }


    // Special Methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    public boolean getageDriving() {
        return ageDriving;
    }
    public void setAgeDriving(boolean ageDriving) {
        this.ageDriving = ageDriving
        ;
    }
}
