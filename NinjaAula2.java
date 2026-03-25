package AulaHerancaMultipla;

public abstract class NinjaAula2 implements NinjaInterface {

    // Numa classe abstrata, você ainda consegue settar/acessar os valores depois, diferente da 'interface'

    String nome;
    String aldeia;
    int idade;
    String ataqueEspecial;

    public NinjaAula2() {
    }

    public NinjaAula2(String nome, String aldeia, int idade, String ataqueEspecial) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.ataqueEspecial = ataqueEspecial;
    }

    public void MostrarInfos() {
        System.out.println("Nome: "+nome);
        System.out.println("Aldeia: "+aldeia);
        System.out.println("Idade: "+idade);
        System.out.println("Ataque especial: "+ataqueEspecial);
    }

    // Metodos abstratos

    public void tacarKunai() {
        System.out.println("Eu taqui uma Kunai");
    }

    @Override
    public void HabilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "e essa é minha habilidade especial");
    }

}
