/*
Desafio 03

Dando continuidade ao Desafio 02, este programa deverá calcular:

- O valor descontado para o INSS (8% sobre o salário bruto)
- O valor descontado para o IR (11% sobre o salário bruto)
- O salário líquido (salário bruto - descontos)

Use os dados já obtidos no programa anterior (nome, horas trabalhadas, valor por hora e salário bruto).
Formate as saídas com duas casas decimais.
*/

package aulas;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nomeTrabalhador = input.nextLine();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = input.nextInt();

        System.out.print("valor por hora: ");
        double valorHora = input.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHora;
        double descontoINSS = salarioBruto * 0.08;
        double descontoIR = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

        System.out.println();
        System.out.printf("Nome do funcionário: %s", nomeTrabalhador);
        System.out.printf("Horas trabalhadas: %d horas\n", horasTrabalhadas);
        System.out.printf("Valor por hora: R$ %.2f", valorHora);
        System.out.printf("\nSalário bruto: R$ %.2f", salarioBruto);
        System.out.printf("\nSalário líquido: R$ %.2f\n", salarioLiquido);
        System.out.printf("\nDescontado para o INSS (8/100 sobre o salário bruto): R$ %.2f", descontoINSS);
        System.out.printf("\nDescontado para o IR (11/100 sobre o salário bruto): R$ %.2f", descontoIR);
    }
}
