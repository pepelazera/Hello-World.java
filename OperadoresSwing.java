package aulas;
import java.util.Scanner;

public class OperadoresSwing {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor 01: ");
        float n1 = input.nextFloat();

        System.out.print("Valor 02: ");
        float n2 = input.nextFloat();

        float div = n1 / n2;
        float raizQuadN1 = (float) Math.sqrt(n1);
        float raiCubN2 = (float) Math.cbrt(n2);
        float Pi = (float) Math.PI;

        //System.out.printf("A divisão de %.0f e %.0f é %.1f", n1, n2, div);
        System.out.printf("\nA raíz quadrada de %.0f é %.1f.", n1, raizQuadN1);
        System.out.printf("\nA raíz cúbica de %.0f é %.1f.", n2, raiCubN2);
        System.out.printf("\nO valor de PI é %.2f.", Pi);
    }
}
