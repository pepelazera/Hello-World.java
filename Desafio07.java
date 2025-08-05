/*
    Crie um programa em Java que:

    Peça ao usuário que digite a temperatura atual (em graus Celsius).

    Com base no valor digitado, exiba uma mensagem sobre o clima, usando apenas estruturas if, else if e else.

    A saída deve seguir a seguinte lógica:

    Temperatura	Mensagem
    abaixo de 10°C	“Muito frio! Vista um casaco pesado.”
    de 10°C a 17.9°C	“Clima frio. Um moletom basta.”
    de 18°C a 24.9°C	“Temperatura agradável.”
    de 25°C a 30.9°C	“Dia quente. Hidrate-se bem!”
    de 31°C a 37.9°C	“Muito quente! Evite atividades físicas.”
    acima de 38°C	“Calor extremo! Fique em locais frescos.”

    Extra: se a temperatura for menor que -5 ou maior que 50, exiba antes da mensagem uma frase de alerta:
    “Valor fora do intervalo climático comum!”
 */

package aulas;
import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite a temperatura atual (gráus célcius): ");
        float temp = keyboard.nextFloat();

        if (temp < -5 || temp > 50) {
            System.out.println("Valor fora do intervalo climático comum.");
        } else if (temp < 10) {
            System.out.println("Muito frio! Vista um casaco pesado.");
        } else if (temp > 9 && temp <= 17.9) {
            System.out.println("Clima frio. Um moletom já basta.");
        } else if (temp > 17.9 && temp < 25) {
            System.out.println("Temperatura agradável.");
        } else if (temp >= 25 && temp < 31) {
            System.out.println("Dia quente. Hidrate-se bem.");
        } else if (temp >= 31 && temp <= 38) {
            System.out.println("Muito quente! Evite atividades físicas.");
        } else if (temp > 38) {
            System.out.println("Calor extremo! Fique em locais frescos.");
        }
    }
}
