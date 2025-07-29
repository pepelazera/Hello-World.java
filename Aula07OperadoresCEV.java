package aulas;

public class Aula07OperadoresCEV {
    public static void main(String[] arg) {
        /*
        int n1 = 3;
        int n2 = 5;
        int soma = n1 + n2;
        float m = (float) (n1 + n2)/2;
        System.out.println("A média de "+soma+" é igual a "+m);
         */


        int num = 5;
        // num++; → Vai somar o valor de "num" + 1
        int valor = 5 + ++num; // Quando quiser somar a outro valor, deve fazer dessa maneira, ou seja, passar o "++" para a frente da variável
        System.out.println("O primeiro valor é "+valor+".");

        int num2 = 5;
        // num2--; // Vai subtrair o valor de "num" - 1
        int valor2 = 5 + --num2;
        System.out.println("O segundo valor é "+valor2+".");

        int x = 4;
        x *= 2; // Mesmo que → x = x +2
        System.out.println("O terceiro valor é "+x+".");
    }
}
