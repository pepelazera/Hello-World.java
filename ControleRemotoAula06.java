package aulasjavapoo;

public class ControleRemotoAula06 implements Controlador {

    // Attributes
    private int vol;
    private boolean on;
    private boolean playing;

    // Specials Methods
    public void Constructor() {
        vol = 50;
        on = true;
        playing = false;
    }

    private int getVolume() {
        return vol;
    }

    private boolean getOn() {
        return on;
    }

    private boolean getPlaying() {
        return playing;
    }

    private void setVol(int v) {
        vol = v;
    }

    private void setOn(boolean o) {
        on = o;
    }

    private void setPlaying(boolean p) {
        playing = p;
    }


    // Abstracts Methods
    @Override
    public void turnOn() {
        this.setVol(50);
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        System.out.println("-------- MENU --------");
        System.out.println("Está ligado ? "+this.getOn());
        System.out.println("Está tocando ? "+this.getPlaying());
        System.out.println("Volume: "+this.getVolume());

        for(int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println();
    }

    @Override
    public void closeMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void moreVolume() {
        if (this.getOn()) {
            this.setVol(this.getVolume() + 5);
        }
        else {
            System.out.println("Não é possível aumentar volume.");
        }
    }

    @Override
    public void lessVolume() {
        if (this.getOn()) {
            this.setVol(this.getVolume() - 5);
        }
        else {
            System.out.println("Não é possível diminuir volume.");
        }
    }

    @Override
    public void muteOn() {
        if (this.getOn() && this.getVolume() > 0) {
            this.setVol(50);
        }
    }

    @Override
    public void muteOff() {
        if (this.getOn() && this.getVolume() == 0) {
            this.setVol(0);
        }
    }

    @Override
    public void play() {
        if (this.getOn() && !(this.getPlaying())) {
            setPlaying(true);
        }
        else {
            System.out.println("Não foi possível reproduzir.");
        }
    }

    @Override
    public void pause() {
        if (this.getOn() && getPlaying()) {
            setPlaying(false);
        }
        else {
            System.out.println("Não foi possível pausar.");
        }
    }
}
