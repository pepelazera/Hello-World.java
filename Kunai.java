package Entities;

public class Kunai {

    private String kunai;

    public Kunai(String kunai) {
        this.kunai = kunai;
    }

    public String getKunai() {
        return kunai;
    }

    public void setKunai(String kunai) {
        this.kunai = kunai;
    }

    @Override
    public String toString() {
        return "Kunai: " + kunai;
    }
}
