package aulasjavapoo;

public class Caneta2 {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    private boolean destampada;

    public Caneta2(String m, String c, float p) {
        modelo = m;
        cor = c;
        ponta = p;
    }

    public void status() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Ponta: " + getPonta());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public boolean isDestampada() {
        return destampada;
    }

    public void setDestampada(boolean destampada) {
        this.destampada = destampada;
    }
}
