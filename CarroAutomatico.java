package AulasJava10x;

public class CarroAutomatico extends Carro {

    String tipoDeCambio;
    int quantidadeDeMarcharAutomaticas;

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
