package aulasjavapoo;

public class Aula12_Programa1 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();


        // Mamifero
        m.setPeso(85.2f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();


        // Peixe
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(3);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();


        // Ave
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(4);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
    }
}
