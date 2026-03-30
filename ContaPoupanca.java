package Desafio05;

/*
    Crie uma classe chamada ContaPoupanca que
    também estende a classe ContaBancaria.
 */

public class ContaPoupanca extends ContaBancaria {

    double valorPoupanca;
    double taxaDeposito;

    public ContaPoupanca() {
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public double depositarValor(double valorDepositado) {
        double taxaDeposito = 0.01 * valorDepositado;

        double depositoFinal = valorDepositado - taxaDeposito;
        saldo += depositoFinal;

        System.out.printf("\nO valor depositado, após passar pelas taxas foi: R$ %.2f", depositoFinal);
        System.out.printf("\nSaldo: R$ %.2f", saldo);

        return 0;
    }
}
