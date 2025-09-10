package aulasjavapoo;

public class ControleRemotoV2 implements SegundoControlador {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais
    public void Construtor() {
        volume = 50;
        ligado = true;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean getTocando() {
        return tocando;
    }


    private void setVolume(int v) {
        volume = v;
    }

    private void setLigado(boolean l) {
        ligado = l;
    }

    private void setTocando(boolean t) {
        tocando = t;
    }

    @Override
    public void ligar() {
        this.setVolume(50);
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------- MENU ---------");
        System.out.println("Ligado ? "+this.getLigado());
        System.out.println("Está tocando ? "+this.getTocando());
        System.out.println("Volume: "+this.getVolume());

        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado()) {
            setVolume(this.getVolume() + 5);
        }
        else {
            System.out.println("Não foi possível aumentar o volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()) {
            setVolume(this.getVolume() - 5);
        }
        else {
            System.out.println("Não foi possível diminuir o volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getTocando()) {
            setTocando(true);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            setTocando(false);
        }
    }
}
