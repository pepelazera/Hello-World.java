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

public class Desafio04Versao2 {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double Input = teclado.nextDouble();
        int PartInt = (int) Input;
        double Dobro = Input * 2;
        double RaizQuad = Math.sqrt(Input);
        double RaizCub = Math.cbrt(Input);
        double ValorAbs = Math.abs(Input);
        double ArrBaixo = Math.floor(Input);
        double ArrCima = Math.ceil(Input);
        double ArrArit = Math.round(Input);
        
        System.out.printf("\n1- A parte inteira de %.2f é: ", Input);
        System.out.println(PartInt);
        System.out.printf("2- O dobro de %.2f é: %.2f", Input, Dobro);
        System.out.printf("\n3- A raíz quadrada de %.2f é: %.2f", Input, RaizQuad);
        System.out.printf("\n4- A raíz cúbica de %.2f é : %.2f\n", Input, RaizCub);
        System.out.printf("\n5- O valor absoluto de %.2f é: %.2f", Input, ValorAbs);
        System.out.printf("\n6- O valor %.2f arredondado para baixo é: %.2f", Input, ArrBaixo);
        System.out.printf("\n7- O valor %.2f arredondado para cima é: %.2f", Input, ArrCima);
        System.out.printf("\n8- O valor %.2f arredondado aritmeticamente é: %.2f", Input, ArrArit);
    }
}
