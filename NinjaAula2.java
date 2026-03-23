package Aulas;

public abstract class NinjaAula2 implements NinjaInterface {

    // Numa classe abstrata, você ainda consegue settar/acessar os valores depois, diferente da 'interface'


    public NinjaAula2() {
        super();
    }

    public NinjaAula2(String nome, String aldeia, int idade, String ataqueEspecial) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.ataqueEspecial = ataqueEspecial;
    }

    String nome;
    String aldeia;
    int idade;
    String ataqueEspecial;

    // Metodos abstratos

    public void tacarKunai() {
        System.out.println("Eu taqui uma Kunai");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "e essa é minha habilidade especial");
    }

}
