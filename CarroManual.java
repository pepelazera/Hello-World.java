package AulasJava10x;

public class CarroManual extends Carro {

    int quantMarchas;
    boolean embreagem;

    public void infosDocarro() {
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano do carro: " + anoDoCarro);
        System.out.println("Esta ligado ? " + estaLigadoOuDesligado);
        System.out.println("Motor: " + motor);
        System.out.println("Preço: U$ " + preco);
        System.out.println();
        System.out.println("Acelerador funcionando ? " + acelerador);
        System.out.println("Freio funcionando ? " + freio);
        System.out.println("Quantidade de marchas: " + quantMarchas);
        System.out.println("Embreagem: " + embreagem);
        painelDeMida();
    }
}

