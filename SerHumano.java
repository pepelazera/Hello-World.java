package aulasjavapoo;

public class SerHumano extends Animal {
    @Override
    public void locomover() {
        System.out.println("Andando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo com garfo e faca");
    }

    @Override
    public void emitirSom() {
        System.out.println("Falando");
    }
}
