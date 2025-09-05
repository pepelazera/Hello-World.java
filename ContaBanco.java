package aulasjavapoo;

public class ContaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    

    // Métodos personalizados
    public void estadoAtual() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("-------------------------------------");
        System.out.println();
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50f);
        }
        else if(t.equals("CPP")) {
            this.setSaldo(150f);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com dívida.");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta: "+ this.getDono());
        }
        else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta: "+ this.getDono());
            }
            else {
                System.out.println("Não foi possível realizar saque: Saldo insuficiente.");
            }
        }
        else {
            System.out.println("Não foi possível realizar saque: Conta fechada.");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("CC") || this.getTipo().equals("cc")) {
            v = 12;
        }
        else if (this.getTipo().equals("CPP") || this.getTipo().equals("cpp")) {
            v = 20;
        }

        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga por sucesso!");
            }
            else {
                System.out.println("Não foi possível realizar pagamento: Conta fechada.");
            }
        }
        else {
            System.out.println("Não foi possível realizar pagamento.");
        }
    }


    // Métodos especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }
    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean sts) {
        this.status = sts;
    }
    public boolean getStatus() {
        return this.status;
    }
}
