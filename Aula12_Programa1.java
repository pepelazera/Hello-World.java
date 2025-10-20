package aulasjavapoo;

public class Aula12_Programa1 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();

        cachorro.reagir("toma a comida");
        cachorro.reagir("Vai apanhar");
        System.out.println();

        cachorro.reagir(11, 45);
        cachorro.reagir(21,0);
        System.out.println();

        cachorro.reagir(true);
        cachorro.reagir(false);
        System.out.println();

        cachorro.reagir(2, 12.5f);
        cachorro.reagir(17, 4.5f);
    }
}
