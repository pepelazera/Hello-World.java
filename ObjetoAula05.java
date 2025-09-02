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
        }
        else if (saldoConta < 0) {
            System.out.println("Conta em débito");
        }
        else {
            setStatusConta(false);
        }
    }

    public void depositar(double v) {
        if (statusConta == true) {
            setSaldoConta(getSaldoConta() + v);
        }
        else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(double v) {
        if (statusConta == true) {
            if (saldoConta > v) {
                setSaldoConta(getSaldoConta() - v);
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
        if(statusConta == true) {
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
