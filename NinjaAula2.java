package AulaHerancaMultipla;

public abstract class NinjaAula2 implements NinjaInterface {

    // Numa classe abstrata, você ainda consegue settar/acessar os valores depois, diferente da 'interface'

    String nome;
    String aldeia;
    int idade;
    String ataqueEspecial;
    //TODO: Incluir dois novos atributos: numeroDeMissoes, Rank
    int numeroDeMissoes;
    NivelNinja rank;

    public NinjaAula2() {
    }

    //TODO: Método existente: primeiro método
    public NinjaAula2(String nome, String aldeia, int idade, String ataqueEspecial) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.ataqueEspecial = ataqueEspecial;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos
    // Você não precisa redeclarar o construtor, somente os novos atributos
    public NinjaAula2(String nome, String aldeia, int idade, String ataqueEspecial, int numeroDeMissoes, NivelNinja rank) {
        this(nome,aldeia, idade, ataqueEspecial);
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }

    public void MostrarInfos() {
        System.out.println("Nome: "+nome);
        System.out.println("Aldeia: "+aldeia);
        System.out.println("Idade: "+idade);
        System.out.println("Ataque especial: "+ataqueEspecial);
        System.out.println("Numero de missões: "+numeroDeMissoes);
        System.out.println("Ranks: "+rank);
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
