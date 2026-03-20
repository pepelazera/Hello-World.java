package AulaPolimorfismo;

public abstract class NinjaAula2 {

    // Numa classe abstrata, você ainda consegue settar/acessar os valores depois, diferente da 'interface'

    String nome;
    String aldeia;
    int idade;
    String ataqueEspecial;

    public abstract void habilidadeEspecial();

    // Metodos abstratos
    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Eu taqui uma Kunai");
    }

}
