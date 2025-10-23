package ProjetoAula14_Correcao;

public class Gafanhoto_Correcao extends Pessoa_Correcao {

    // Atributos
    private String login;
    private int totAssistido;


    // Metodos
    public Gafanhoto_Correcao(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); // Chama a superclasse
        this.login = login;
        this.totAssistido = 0;
    }


    // Getters e Setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }


    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }


    // Metodos sobrepostos
    @Override
    public String toString() {
        return " Gafanhoto_Correcao { " +
                " login = " + login + '\'' +
                ", totAssistido = " + totAssistido +
                " } ";
    }
}
