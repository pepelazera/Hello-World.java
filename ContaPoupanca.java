package Desafio05;

public class ContaPoupanca extends ContaBancaria {

    double valorPoupanca;
    double taxaDeposito;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void depositarValor() {
    }

    @Override
    public double depositarValor(double valorDepositado) {
        return super.depositarValor(valorDepositado);
    }
}