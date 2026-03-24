package ExercicioBancoDeDados;

import java.util.Date;

public class Pacientes extends RegistroHospital {

    Date dataNascimento;

    public Pacientes() {
        super();
    }

    public Pacientes(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pacientes(String nome, String telefone, int cpf, Date dataNascimento) {
        super(nome, telefone, cpf);
        this.dataNascimento = dataNascimento;
    }

}
