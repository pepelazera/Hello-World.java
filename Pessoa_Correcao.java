package ProjetoAula14_Correcao;

public abstract class Pessoa_Correcao {

    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;


    // Metodos
    public Pessoa_Correcao(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public float getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }


    // Metodos sobrepostos
    @Override
    public String toString() {
        return "Pessoa_Correcao { " +
                "experiencia = " + experiencia +
                ", sexo = " + sexo + '\'' +
                ", idade = " + idade +
                ", nome = " + nome + '\'' +
                " } ";
    }
}
