package ExercicioBancoDeDados;

public abstract class RegistroHospital {

    String nome;
    String telefone;
    int cpf;

    public RegistroHospital() {
    }

    public RegistroHospital(String nome, String telefone, int cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

}
