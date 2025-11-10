package ExerciseSection10;
import java.util.Scanner;

public class POO002 {
    Scanner sc = new Scanner(System.in);

    private int n;
    private float sum;
    private float avg;


    public void Values() {
        System.out.print("How many values do you whant to write ? ");
        this.setN(sc.nextInt());

        float[] vect = new float[this.getN()];

        for (int i=0; i<vect.length; i++) {
            System.out.printf("Write the %s number: ", i+1);
            vect[i] = sc.nextFloat();

        }

        // Sum
        for (int i=0; i<vect.length; i++) {
            this.setSum(this.sum += vect[i]);
        }

        // Average
        for (int i=0; i<vect.length; i++) {
            this.setAvg(this.getSum() / this.getN());
        }


        System.out.print("Values: ");
        for (int i=0; i<vect.length; i++) {
            System.out.printf(" '%.2f' ", vect[i]);
        }

        System.out.printf("\nThe sum of all the numbers are: %.2f%n",this.getSum());
        System.out.printf("The average of all the numbers are: %.2f%n",this.getAvg());
    }


    // Getters and Setters
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }


    public float getSum() {
        return sum;
    }
    public void setSum(float sum) {
        this.sum = sum;
    }


    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }
}
