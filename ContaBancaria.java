package Desafio05;

/*
    Crie uma classe abstrata chamada
    ContaBancaria que implementa a interface
    Conta
 */

public abstract class ContaBancaria implements Conta {

    double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("\nSaldo bancario: %.2f", saldo);
    }

    @Override
    public double depositarValor(double valorDepositado) {
        saldo += valorDepositado;

        System.out.printf("\nValor depositado: %.2f", valorDepositado);
        System.out.printf("\nSaldo atual: %.2f", saldo);

        return 0;
    }

    public void infosConta() {
        System.out.printf("\nSaldo total: %.2f", saldo);
    }
}
