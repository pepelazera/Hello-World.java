package ExercicioBancoDeDados;

public class Medico extends RegistroHospital {

    int CRM;
    String email;

    public Medico() {
        super(); // Indica que esse constructor
    }

    public Medico(String nome, String telefone, int cpf, int CRM, String email) {
        super(nome, telefone, cpf);
        this.CRM = CRM;
        this.email = email;
    }
}
