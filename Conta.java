package Desafio05;

public interface Conta {

    void consultarSaldo();
     abstract void depositarValor();

    double depositarValor(double valorDepositado);
}
