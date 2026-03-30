package Desafio05;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
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
