package aulasjavapoo;
import java.util.Locale;

public class DesafioAula07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Lutadores l0 = new Lutadores("Pretty boy", "França", 31, 1.75f, 68.8f, 11, 2, 1);

        Lutadores l1 = new Lutadores("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

        Lutadores l2 = new Lutadores("Xvidamansa", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);

        Lutadores l3 = new Lutadores("Dead code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);

        Lutadores l4 = new Lutadores("Nintown", "Nepal", 32, 1.88f, 101.2f, 12, 4, 4);

        Lutadores l5 = new Lutadores("Nepharius", "Alemanha", 23, 1.99f, 115.4f, 15, 0, 1);

        l0.apresentar();
        l2.status();
        l1.ganharLuta();
        l0.empatarLuta();
    }
}
