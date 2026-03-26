package Exercicios;

public class CarroAltoDesempenho extends Carro implements CarroAltaPerformance {

    double cronometro0a100;
    double cronometro0a200;

    public CarroAltoDesempenho() {
    }

    public CarroAltoDesempenho(String modeloDoCarro, int anoDoCarro, boolean estaLigadoOuDesligado, double motor, double preco, boolean acelerador,
                               boolean freio, boolean painelDeMidia, double cronometro0a100, double cronometro0a200) {

        super(modeloDoCarro, anoDoCarro, estaLigadoOuDesligado, motor, preco, acelerador, freio, painelDeMidia);
        this.cronometro0a100 = cronometro0a100;
        this.cronometro0a200 = cronometro0a200;
    }

    @Override
    public void tempo0a100() {
        System.out.println("Tempo do 0 a 100: " + cronometro0a100 + " segundos");
    }

    @Override
    public void tempo0a200() {
        System.out.println("Tempo do 0 a 200: " + cronometro0a200 + " segundos");
    }

}
