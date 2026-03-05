package Entities;

public class Parchment {

    private String parchment;

    public Parchment(String invocation) {
        this.parchment = invocation;
    }

    public String getParchment() {
        return parchment;
    }

    public void setParchment(String parchment) {
        this.parchment = parchment;
    }

    @Override
    public String toString() {
        return "Parchment: " + parchment;
    }
}
