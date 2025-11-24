package ExerciseSection10;
import java.util.Scanner;

public class Height {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private float height;
    private int n;

    public void Average() {
        System.out.print("How many people do you want to register ? ");
        n = sc.nextInt();

        double avg = 0;

        for (int i=0; i<n; i++) {
            System.out.print("Name: ");
            sc.nextLine();
            this.setName(sc.nextLine());

            System.out.print("Age: ");
            this.setAge(sc.nextInt());

            System.out.print("Height: ");
            this.setHeight(sc.nextFloat());

            System.out.println();

            float[] heights = new float[(int) this.getHeight()];

            for (int f = 0; f< heights.length; f++) {
                avg += this.getHeight() / n;
            }
        }

        int cont = 0;

        for (int i=0; i<n; i++) {
            if (this.age < 16) {
                cont = cont + 1;
            }
        }

        double porcent = cont * 100.0 / n;

        System.out.printf("The average height is: %.2f", avg);
        System.out.printf("\nPeople with less 16 years: %.1f%%", porcent);
        System.out.println();
    }

    // Getters and Setters
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

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
}
