public class CalculadoraSimples {

    double primeiroValor;
    double segundoValor;

    public double somar(double primeiroValor, double segundoValor) {
        return primeiroValor + segundoValor;
    }

    public double subtrair(double primeiroValor, double segundoValor) {
        return primeiroValor - segundoValor;
    }

    public double multiplicar(double primeiroValor, double segundoValor) {
        return primeiroValor * segundoValor;
    }

    public double dividir(double primeiroValor, double segundoValor) {
        return (double) primeiroValor / segundoValor;
    }
}
