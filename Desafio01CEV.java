package aulasjavapoo;

public class Desafio01CEV {
    public static void main(String[] args) {

        Microfone m1 = new Microfone();
        Aerolin a1 = new Aerolin();

        m1.modelo = "Hyperx Solocast";
        m1.cor = "Preto";
        m1.botoes = 1;
        m1.estado = "Usado";
        m1.statusMicrofone();
        m1.funcionamento();

        System.out.println();

        a1.modelo = "Aerolin padrão";
        a1.cor = "Verde";
        a1.estado = "Novo";
        a1.carga = 200;
        a1.status();
        a1.funcionamento2();
    }
}
