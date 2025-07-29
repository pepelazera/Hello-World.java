/*
Desafio 04 - Calculadora de Propriedades Matemáticas

Crie um programa que leia um número real digitado pelo usuário e exiba na tela as seguintes informações:

1. O número digitado.
2. A parte inteira do número.
3. O dobro do número.
4. A raiz quadrada do número.
5. O valor absoluto do número.
6. O número arredondado para baixo (floor).
7. O número arredondado para cima (ceil).
8. O número arredondado normalmente (round).
9. O número elevado ao cubo.

Utilize a classe Scanner para entrada de dados e os métodos da classe Math para realizar os cálculos necessários.

Exemplo de saída:
Digite um número: 5.67

Analisando o número 5.67:
Parte inteira: 5
Dobro: 11.34
Raiz quadrada: 2.38
Valor absoluto: 5.67
Arredondado para baixo: 5.0
Arredondado para cima: 6.0
Arredondado normalmente: 6
Elevado ao cubo: 182.85

Dica: use casting (conversão de tipo) quando necessário.
*/

package aulas;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double InputValor = entrada.nextFloat();
        int ParteInteira = (int) InputValor;
        double Dobro = (InputValor * 2);
        double RaizQuad = Math.sqrt(InputValor);
        double Absoluto = Math.abs(InputValor);
        double ArrBaixo = Math.floor(InputValor);
        double ArrCima = Math.ceil(InputValor);
        double ArrArit = Math.round(InputValor);
        double RaizCub = Math.cbrt(InputValor);

        System.out.printf("\n1- O número digitado foi: %.2f", InputValor);
        System.out.printf("\n2- A parte inteira do valor %.2f é: ", InputValor);
        System.out.println(ParteInteira);
        System.out.printf("3- O dobro de %.1f é: %.2f", InputValor, Dobro);
        System.out.printf("\n4- A raíz quadrada de %.1f é: %.2f", InputValor, RaizQuad);
        System.out.printf("\n5- O valor absoluto de %.1f é: %.2f\n", InputValor, Absoluto);
        System.out.printf("\n6- Arredondando para baixo, o valor fica: %.2f", ArrBaixo);
        System.out.printf("\n7- Arredondando para cima, o valor fica: %.2f", ArrCima);
        System.out.printf("\n8- Arredondando aritmeticamente, o valor fica %.2f", ArrArit);
        System.out.printf("\n9- A raíz cúbica de %.1f é: %.2f", InputValor, RaizCub);
    }
}
