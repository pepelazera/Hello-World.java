import java.util.Scanner;

public class MainDaCalculadora {
    public static void main(String[] args) {

        Scanner ct = new Scanner(System.in);
        CalculadoraSimples calculadoraSimples = new CalculadoraSimples();

        System.out.print("Digite o primeiro valor: ");
        double primeiroValor = calculadoraSimples.primeiroValor = ct.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double segundoValor = calculadoraSimples.segundoValor = ct.nextDouble();

        double soma = calculadoraSimples.somar(primeiroValor, segundoValor);
        double sub = calculadoraSimples.subtrair(primeiroValor, segundoValor);
        double mult = calculadoraSimples.multiplicar(primeiroValor, segundoValor);
        double div = calculadoraSimples.dividir(primeiroValor, segundoValor);

        System.out.println("\nValor da soma: " + soma);
        System.out.println("Valor da subtracao: " + sub);
        System.out.println("Valor da multiplicacao: " + mult);
        System.out.printf("Valor da divisao: %.2f", div);

    }
}
