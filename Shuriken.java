package Entities;

public class Shuriken {

    private int size;

    public Shuriken(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shuriken: " + size;
    }
}
