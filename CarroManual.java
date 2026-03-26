package Exercicios;

public class CarroManual extends Carro {

    int quantMarchas;
    boolean embreagem;

    public CarroManual() {
        super();
    }

    public CarroManual(String modeloDoCarro, int anoDoCarro, boolean estaLigadoOuDesligado, double motor, double
            preco, boolean acelerador, boolean freio, boolean painelDeMidia, int quantMarchas, boolean embreagem) {

        super(modeloDoCarro, anoDoCarro, estaLigadoOuDesligado, motor, preco, acelerador, freio, painelDeMidia);
        this.quantMarchas = quantMarchas;
        this.embreagem = embreagem;
    }

}
