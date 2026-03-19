package AulasJava10x;

public class CarrosAltoDesempenho extends Carro implements CarrosAltaPerformance {

    double cronometro0a100;
    double cronometro0a200;

    @Override
    public void tempo0a100() {
        System.out.println("Tempo do 0 a 100: " + cronometro0a100 + " segundos");
    }

    @Override
    public void tempo0a200() {
        System.out.println("Tempo do 0 a 200: " + cronometro0a200 + " segundos");
    }

    public void infosDocarro() {
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano do carro: " + anoDoCarro);
        System.out.println("Esta ligado ? " + estaLigadoOuDesligado);
        System.out.println("Motor: " + motor);
        System.out.println("Preço: U$ " + preco);
        tempo0a100();
        tempo0a200();

        System.out.println();
        System.out.println("Acelerador funcionando ? " + acelerador);
        System.out.println("Freio funcionando ? " + freio);
        painelDeMida();
    }

}
