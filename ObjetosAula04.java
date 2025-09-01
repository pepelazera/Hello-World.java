package aulasjavapoo;

public class ObjetosAula04 {
    private String pc;
    private String modelo;
    private String cor;
    private int pecas;
    private float valor;
    private boolean ligar;
    private boolean desligar;

    public ObjetosAula04(String pc, String m, String c, int p, float v) {
        this.pc = pc;
        this.modelo = m;
        this.cor = c;
        this.pecas = p;
        this.valor = v;
    }

    public void status() {
        System.out.println("Objeto: " + getPc());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Quantidade de peças: " + getPeca());
        System.out.println("Está ligado: " + getDesligar());
        System.out.println("Valor: R$" + getValor());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPeca() {
        return pecas;
    }

    public void setPecas(int quantPecas) {
        this.pecas = quantPecas;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public  boolean getLigar() {
        return ligar;
    }

    public boolean getDesligar() {
        return desligar;
    }

    public void setLigar() {
        this.ligar = true;
    }

    public void setDesligar() {
        this.desligar = false;
    }
}
