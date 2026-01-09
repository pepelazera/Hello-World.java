package Exercises;

public class Height {

    public static void main(String[] args) {
        double[] heights = {1.76, 1.85, 1.90, 1.72};
        double bigger = heights[0];
        double smaller = heights[0];
        double[] reverses = new double[heights.length];

        for (double height : heights) {
            if (height > bigger) {
                bigger = height;
            }

            if (height < smaller) {
                smaller = height;
            }
        }

        System.out.print("Reverse order: { ");
        for (int i = heights.length - 1; i >= 0; i--) {
            reverses[i] = heights[i];

            System.out.print(reverses[i] + " ");
        }
        System.out.println("}");


            System.out.println();
            System.out.println("The bigger guy on the Array: " + bigger);
            System.out.println("The smaller guy on the Array: " + smaller);
    }
}
