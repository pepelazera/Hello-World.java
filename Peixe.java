package aulasjavapoo;

public class Peixe extends Animal {
    // Atributos
    private String corEscamas;


    // Metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao emite som");
    }

    public void soltarBolha() {
        System.out.println("Blup, Blup");
    }


    // Metodos especiais
    public String getCorEscamas() {
        return corEscamas;
    }
    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}
