package aulasjavapoo;

public class SoftwareLivraria {
    public static void main(String[] args) {

        ObjetoSoftwareLivraria o1 = new ObjetoSoftwareLivraria();

        System.out.println("Livro 1: ");
        o1.construtor1();

        System.out.println();

        System.out.println("Livro 2: ");
        o1.construtor2();

        System.out.println();
        System.out.println("Total de livros: "+o1.getTotalLivros());
        o1.quantMinima();
    }
}

