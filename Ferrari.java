package AulasJava10x;

public class Ferrari extends CarrosAltoDesempenho {

    boolean f1Mode;

    public void infosDocarro() {
        super.infosDocarro();

        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano do carro: " + anoDoCarro);
        System.out.println("Esta ligado ? " + estaLigadoOuDesligado);
        System.out.println("Motor: " + motor);
        System.out.println("Preço: U$ " + preco);
        System.out.println("Tem o modo f1 ? " + f1Mode);
        tempo0a100();
        tempo0a200();

        System.out.println();
        System.out.println("Acelerador funcionando ? " + acelerador);
        System.out.println("Freio funcionando ? " + freio);
        painelDeMida();
    }

}
