package aulas;

/*
Desafio 02

Crie um programa em Java que leia o nome de um funcionário, o número de horas trabalhadas no mês
e o valor que ele recebe por hora. Com essas informações, o programa deverá calcular e exibir:

- O salário bruto
- O valor descontado para o INSS (8% sobre o salário bruto)
- O valor descontado para o IR (11% sobre o salário bruto)
- O salário líquido (salário bruto - descontos)

A saída deve seguir o formato:

Nome do funcionário: Pedro Alves
Horas trabalhadas: 40
Valor por hora: R$ 25.00

Salário Bruto: R$ 1000.00
Desconto INSS (8%): R$ 80.00
Desconto IR (11%): R$ 110.00
Salário Líquido: R$ 810.00

Use variáveis do tipo double e formate as saídas com duas casas decimais.
*/

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        String nome = input.nextLine();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = input.nextInt();
        System.out.print("valor por hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Salário bruto: ");
        float salarioBruto = input.nextFloat();

        System.out.println();
        System.out.printf("Nome do funcionário: %s", nome);
        System.out.println("\nHoras trabalhadas: "+horasTrabalhadas+" horas");
        System.out.printf("Valor por hora: R$ %.2f", valorHora);
        System.out.println("\nSalário bruto: R$ "+salarioBruto);
    }
}
