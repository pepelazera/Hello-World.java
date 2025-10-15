package aulasjavapoo;

public class Mamifero extends Animal {
    // Atributos
    private String corPelo;



    // Metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando (la ele)");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }


    // Metodos especiais

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
