package Exercicios;

import java.util.Locale;

public class MainCarro {
    public static void main() {

        Locale.setDefault(Locale.US);

        // String modeloDoCarro, int anoDoCarro, boolean estaLigadoOuDesligado, double motor, double preco, boolean acelerador, boolean freio, boolean painelDeMidia

        // Chamando classes
        CarroAutomatico bmw320i = new CarroAutomatico();
        CarroManual mustangShelby = new CarroManual();
        CarroAltoDesempenho lamborghini = new CarroAltoDesempenho();
        Ferrari ferrari = new Ferrari("Ferrari Purossangue", 2021, true, 5.0, 635000,
                true, true, true, 2.5, 6.6);

        ferrari.infosDocarro();

    }
}
