package AulaHeranca.exercicio;

public class Ninja {

    // Temos dois tipos de metodos: void e return

    String nome;
    String aldeia;
    String claNinja;
    int idade;
    String missao;
    String StatusDaMissao;
    String nivelDaMissao;


    /*
        Quando eu utilizo um metodo vazio (void), eu não preciso do return no final desse mesmo,
        pois como eu passei um tipo vazio, não tenho que retornar nenhum parametro tambem.
        Além disso, o parenteses eh o que faz o Java identificar o metodo. Sem isso, o que eu estou escrevendo não significaria nada
     */

    // Metodo geral. Todos os ninjas vao ter


    // Criar um metodo publico personalizado
    public void mostrarInfos() {
        System.out.println("Informações sobre o Ninja: ");
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Clã: " + claNinja);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel da missao: " + nivelDaMissao);
        System.out.println("Status da missao: " + StatusDaMissao);
    }

    public String euSouUmNinja() {
        return "Oi, bom dia. Eu sou um ninja";
    }

    public int anosParaHokage(int idadeMinimaHokage) {
        return idadeMinimaHokage - idade;
    }

}
