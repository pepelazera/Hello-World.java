package Exercicios;

public class CarroAutomatico extends Carro implements CarroDuasVersoes {

    String tipoDeCambio;
    int quantidadeDeMarcharAutomaticas;

    public CarroAutomatico() {
    }

    public CarroAutomatico(String modeloDoCarro, int anoDoCarro, boolean estaLigadoOuDesligado, double motor, double preco,
                           boolean acelerador, boolean freio, boolean painelDeMidia, String tipoDeCambio, int quantidadeDeMarcharAutomaticas) {
        super(modeloDoCarro, anoDoCarro, estaLigadoOuDesligado, motor, preco, acelerador, freio, painelDeMidia);
        this.tipoDeCambio = tipoDeCambio;
        this.quantidadeDeMarcharAutomaticas = quantidadeDeMarcharAutomaticas;
    }
}
