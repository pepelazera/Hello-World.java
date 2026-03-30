package ProjetoAula14.Desafio05;

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
        saldo += valorDepositado;

        System.out.printf("\nValor depositado: %.2f", valorDepositado);
        System.out.printf("\nSaldo atual: %.2f", saldo);

        return 0;
    }
}
