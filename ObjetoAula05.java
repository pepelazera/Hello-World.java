package aulasjavapoo;
public class ObjetoAula05 {

    // Atributos
    public int numConta;
    protected String tipConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;


    // Metodos especiais
    public void Construtor() {
        saldoConta = 0;
        statusConta = false;
    }

    // Metodos
    public void abrirConta(String tc) {
       setTipConta(tc);
       setStatusConta(true);

       if (tipConta.equals("CC") || tipConta.equals("cc")) {
           saldoConta = 50f;
       }
       else if (tipConta.equals("CPP") || tipConta.equals("cpp")) {
           saldoConta = 150f;
       }
    }

    public void fecharConta() {
        if (saldoConta > 0) {
            System.out.println("Conta com dinheiro");
            System.out.println("Valor na conta: " + getSaldoConta());
        }
        else if (saldoConta < 0) {
            System.out.println("Conta em débito");
        }
        else {
            System.out.println("Conta fechada com sucesso!");
            setStatusConta(false);
        }
    }

    public void depositar(double v) {
        if (!getStatusConta()) {
            setSaldoConta(getSaldoConta() + v);
        }
        else {
            System.out.println("Impossível depositar");
        }

        if (!getStatusConta() && v > 0) {
            System.out.println("Valor depositado com sucesso!");
        }
        else {
            System.out.println("Impossível depositar esse valor");
        }
    }

    public void sacar(double v) {
        if (!getStatusConta()) {
            if (saldoConta > 0) {
                setSaldoConta(getSaldoConta() - v);
                System.out.printf("Valor %.2f sacado.", v);
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(double v) {
        if (tipConta.equals("CC")) {
            v = 12;
        }
        else if (tipConta.equals("CPP")) {
            v = 20;
        }

        if(!getStatusConta()) {
            if (saldoConta > v) {
                setSaldoConta(getSaldoConta() - v);
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível pagar");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNUmConta(int n) {
        numConta = n;
    }

    public String getTipConta() {
        return tipConta;
    }

    public void setTipConta(String tc) {
        tipConta = tc;
    }

    public String getDonoConta() {
        return donoConta.strip();
    }

    public void setDonoConta(String dc) {
        donoConta = dc.strip();
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double s) {
        saldoConta = s;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean s) {
        statusConta = s;
    }
}
