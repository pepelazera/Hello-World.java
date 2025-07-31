/*
Desafio 05:
1.
    Receber a idade de um gafanhoto:
    Peça ao usuário para digitar a idade do participante.

2.
    Verificar a categoria: Com base na idade,
    o programa deve informar a categoria do gafanhoto:

3.
    Verificar aptidão para a fase avançada: Além da categoria,
    o programa deve verificar se o gafanhoto está apto a participar da 'Fase Avançada da Competição'.
    Apenas gafanhotos das categorias 'Júnior', 'Sênior' e 'Master' podem participar desta fase.
    Se ele for apto, exiba uma mensagem de parabéns!

4.
    Verificar bônus de experiência: Se o gafanhoto for da categoria 'Master'
    e tiver mais de 30 anos, ele ganha um bônus de experiência e uma mensagem especial deve ser exibida.
 */

package aulas;
import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual sua idade: ");
        int idade = teclado.nextInt();
        String categoria = "";

        System.out.print("Sua categoria é ");
        if (idade < 10){
            categoria = "Mirím";
        } else if (idade <= 14) {         // lembre-se do "e" que é &&
            categoria = "Infantil";
        } else if (idade <= 19) {
            categoria = "Júnior";
        } else if (idade >= 20 && idade <= 25) {
            categoria = "Sênior";
        } else if (idade >= 26) {
            categoria = "Master";
        }
        System.out.println(categoria);
        if (categoria.equals("Júnior") || categoria.equals("Sênior") || categoria.equals("Master")) {
            System.out.println("Parabéns! Você é apto a participar da Fase Avançada da Competição!");
        }
        if (categoria.equals("Master") && idade > 30){
            System.out.println("Além disso, você está acima dos 30 anos de experiência e por isso receberá um bônus. Meus parabéns!");
        }
    }
}