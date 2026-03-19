package AulasJava10x;

import java.util.Locale;

public class MainCarros {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Chamando classes
        CarroAutomatico bmw320i = new CarroAutomatico();
        CarroManual mustangShelby = new CarroManual();
        CarrosAltoDesempenho lamborghini = new CarrosAltoDesempenho();
        Ferrari ferrari = new Ferrari();

        // Objeto 1
        bmw320i.modeloDoCarro = "BMW 320i";
        bmw320i.anoDoCarro = 2019;
        bmw320i.estaLigadoOuDesligado = true;
        bmw320i.motor = 2.0;
        bmw320i.preco = 6200.00;
        bmw320i.tipoDeCambio = "KVT";
        bmw320i.quantidadeDeMarcharAutomaticas = 8;
        bmw320i.painelDeMidia = true;
        bmw320i.acelerador = true;
        bmw320i.freio = false;


        // Objeto 2
        mustangShelby.modeloDoCarro = "Mustang Shelby";
        mustangShelby.anoDoCarro = 2022;
        mustangShelby.estaLigadoOuDesligado = false;
        mustangShelby.motor = 5.0;
        mustangShelby.preco = 15000.00;
        mustangShelby.quantMarchas = 6;
        mustangShelby.embreagem = true;
        mustangShelby.painelDeMidia = true;
        mustangShelby.acelerador = true;
        mustangShelby.freio = false;

        // Objeto 3
        lamborghini.modeloDoCarro = "Lamborghini sesto elemento";
        lamborghini.anoDoCarro = 2012;
        lamborghini.estaLigadoOuDesligado = false;
        lamborghini.motor = 5.2;
        lamborghini.preco = 500000.00;
        lamborghini.cronometro0a100 = 2.5;
        lamborghini.cronometro0a200 = 8.0;
        lamborghini.painelDeMidia = false;
        lamborghini.acelerador = true;
        lamborghini.freio = true;

        // Objeto 4
        ferrari.modeloDoCarro = "Ferrari 296gtb";
        ferrari.anoDoCarro = 2024;
        ferrari.estaLigadoOuDesligado = false;
        ferrari.motor = 3.0;
        ferrari.preco = 300000.00;
        ferrari.cronometro0a100 = 2.9;
        ferrari.cronometro0a200 = 7.2;
        ferrari.f1Mode = true;
        ferrari.painelDeMidia = true;
        ferrari.acelerador = true;
        ferrari.freio = true;

        // Chamando métodos
        bmw320i.infosDocarro();
        System.out.println();

        mustangShelby.infosDocarro();
        System.out.println();

        lamborghini.infosDocarro();
        System.out.println();

        ferrari.infosDocarro();
        System.out.println();
    }
}
