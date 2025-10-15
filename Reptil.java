package aulasjavapoo;

public class Reptil extends Animal {
    // Atributos
    private String corEscamas;


    // Metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil (seja la qual for)");
    }


    // Metodos especiais
    public String getCorEscamas() {
        return corEscamas;
    }
    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}
