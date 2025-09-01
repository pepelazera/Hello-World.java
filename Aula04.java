package aulasjavapoo;
public class Aula04 {
    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2("BIC", "Vermelha", 0.9f);
        c1.status();

        System.out.println();

        Caneta2 c2 = new Caneta2("Click", "Azul", 0.5f);
        c2.status();
    }
}
