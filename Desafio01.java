package aulas;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu, <nome>, moro no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>

 */

public class Desafio01 {
    public static void main(String[] arg){
        String nome = "Pedro";
        String endereco = "Av. dos Holandeses";
        String dataRecebimento = "15/12/2025";
        Float salario = 2180.5f;
        System.out.printf("Eu, %s, moro no endereço: %s, confirmo que recebi o salário de %.1f, na data %s.", nome , endereco, salario, dataRecebimento);
    }
}
