package aulasjavapoo;
import java.util.Scanner;

public class Microfone {
    String modelo;
    String cor;
    int botoes;
    String estado;
    String resp;

    void statusMicrofone() {
        System.out.println("Modelo: "+ modelo);
        System.out.println("Cor: "+ cor);
        System.out.println("Quantidade de botões: "+ botoes);
        System.out.println("Estado do objeto: "+ estado);
    }

    void funcionamento() {
        Scanner sc = new Scanner(System.in);

        System.out.print("O microfone está emitindo uma luz vermelha ? ");
        resp = sc.nextLine().toLowerCase().strip();
        if (resp.equals("sim") || resp.equals("s") || resp.equals("si") || resp.equals("yes")
                || resp.equals("ye") || resp.equals("ys") || resp.equals("y")) {
            System.out.println("Áudio ligado");
        }
        else if (resp.equals("não") || resp.equals("nao") || resp.equals("n")
                || resp.equals("na") || resp.equals("no")) {
            System.out.println("Áudio desligado");
        }
        else {
            System.out.println("ERRO!");
        }

        sc.close();
    }
}
