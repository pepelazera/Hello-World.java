package Desafio05;

/*
    Crie uma classe chamada ContaCorrente que
    estende a classe ContaBancaria
 */

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public double depositarValor(double valorDepositado) {
        return super.depositarValor(valorDepositado);
    }
}
