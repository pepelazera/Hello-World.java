package Exercicios;

public class Ferrari extends Carro implements CarroAltaPerformance, F1mode {

    double cronometro0a100;
    double cronometro0a200;

    public Ferrari() {
        super();
    }

    public Ferrari(String modeloDoCarro, int anoDoCarro, boolean estaLigadoOuDesligado, double motor, double preco,
                   boolean acelerador, boolean freio, boolean painelDeMidia, double cronometro0a100, double cronometro0a200) {

        super(modeloDoCarro, anoDoCarro, estaLigadoOuDesligado, motor, preco, acelerador, freio, painelDeMidia);
        this.cronometro0a100 = cronometro0a100;
        this.cronometro0a200 = cronometro0a200;
    }

    @Override
    public void tempo0a100() {
        System.out.printf("%s tem seu 0 a 100 em %.2f segundos\n", modeloDoCarro, cronometro0a100);
    }

    @Override
    public void tempo0a200() {
        System.out.printf("%s tem seu 0 a 100 em %.2f segundos\n", modeloDoCarro, cronometro0a200);
    }

    @Override
    public void f1modeFerrari() {
        System.out.printf("%s vem com o F1 mode, pois é um carro da Ferrari", modeloDoCarro);
    }

}
