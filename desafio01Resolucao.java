package aulas;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu, <nome>, moro no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>

 */

public class desafio01Resolucao {
    public static void main(String[] arg){
        String nome = "Lazera";
        String endereco = "Av. dos Holandeses";
        double salario = 5431.12;
        String dataRecebimento = "15/12/2005";
        String resultado = "Eu, "+ nome + ", moro no endereço: "+ endereco +", confirmo que recebi o saláio de "+ salario + ", na data "+ dataRecebimento;
        System.out.println(resultado);
    }
}
