package aulasjavapoo;
import java.util.Scanner;

public class Aerolin {
    public String modelo;
    public String cor;
    public String estado;
    public String resp;
    public int carga;

    void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Carga: " + carga);
        System.out.println("Estado " + estado);
    }

    void funcionamento2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("O microfone está emitindo uma luz vermelha ? ");
        resp = sc.nextLine().toLowerCase().strip();
        if (resp.equals("sim") || resp.equals("s") || resp.equals("si") || resp.equals("yes")
                || resp.equals("ye") || resp.equals("ys") || resp.equals("y")) {
            System.out.println("Áudio ligado");
        } else if (resp.equals("não") || resp.equals("nao") || resp.equals("n")
                || resp.equals("na") || resp.equals("no")) {
            System.out.println("Áudio desligado");
        } else {
            System.out.println("ERRO!");
        }

        sc.close();
    }
}
