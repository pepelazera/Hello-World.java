package AulasJava10x;

public class Carro implements CarroComDuasVersoes{

    String modeloDoCarro;
    int anoDoCarro;
    boolean estaLigadoOuDesligado;
    double motor;
    double preco;

    boolean acelerador;
    boolean freio;
    boolean painelDeMidia;


    @Override
    public void painelDeMida() {
        System.out.println("Tem painel de mídia ? " + painelDeMidia);
    }

    public void infosDocarro() {
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano do carro: " + anoDoCarro);
        System.out.println("Esta ligado ? " + estaLigadoOuDesligado);
        System.out.println("Motor: " + motor);
        System.out.println("Preço: U$ " + preco);
        System.out.println();
        System.out.println("Acelerador funcionando ? " + acelerador);
        System.out.println("Freio funcionando ? " + freio);
        painelDeMida();
    }
}
