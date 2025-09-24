package aulasjavapoo;
import java.util.Locale;

public class DesafioAula07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Asta", "Alemanha", 18, 1.88f, 100f, 10, 0, 2);

        l[1] = new Lutador("Ichigo", "Suécia", 29, 1.68f, 57.8f, 14, 2, 3);

        l[2] = new Lutador("Zoro", "Japão", 27, 1.80f, 82.9f, 12, 2, 1);

        l[3] = new Lutador("Kakashi", "Japão", 35, 1.88f, 81.6f, 13, 0, 2);

        l[4] = new Lutador("Shinra", "EUA", 18, 1.72f, 70f, 8, 3, 3);

        l[5] = new Lutador("Luffy", "Brasil", 19, 1.74f, 68.2f, 15, 0, 0);

        l[0].apresentar();
        l[0].status();

        System.out.println();

        l[5].apresentar();
        l[5].status();
    }
}
