package aulasjavapoo;
import java.util.Scanner;

public class ObjectClass09V1Person {
    Scanner sc = new Scanner(System.in);

    private String name;
    private int age;
    private String gender;
    private String born;


    // Special Methods
    public void bookReader() {
        System.out.print("Name: ");
        this.setName(sc.nextLine());


        System.out.print("How old will you be this year ? ");
        this.setAge(sc.nextInt());


        System.out.print("Gender: ");
        this.setGender(sc.next());

        System.out.print("When are you born ? ");
        born = sc.next();
    }

    public void doBirthday(){
        this.setAge(this.getAge() + 1);
    }

    public void birthday() {
        int B = 2025 - this.getAge();
        System.out.printf("- Birthday: %s/%s -", this.getBorn(), B);
    }


    public void details2() {
        System.out.println("=== READER STAUTS ===");
        System.out.println("- Name: "+this.getName()+" -");
        System.out.println("- Age: "+this.getAge()+" -");
        System.out.println("- Gender: "+this.getGender()+" -");
        birthday();
    }


    // Methods
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

    public String getBorn() {
        return born;
    }
    public void setBorn(String born) {
        this.born = born;
    }
}
