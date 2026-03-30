package Desafio05;

public class MainContaBancaria {
    static void main() {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.saldo = 350.00;
        contaCorrente.depositarValor(50);

        System.out.println();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.saldo = 250.00;
        contaPoupanca.depositarValor(70);

    }
}
