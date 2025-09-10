package aulasjavapoo;
import java.util.Scanner;

public class Aula06V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ControleRemotoV2 c2 = new ControleRemotoV2();

        while (true) {
            System.out.print("Deseja ligar o controle ? ");
            String resp = sc.nextLine().toLowerCase();
            if (resp.equals("sim") || resp.equals("s")
                    || resp.equals("ss") || resp.equals("si")) {
                c2.ligar();
                break;
            } else if (resp.equals("não") || resp.equals("nao") ||
                    resp.equals("n") || resp.equals("nã")
                    || resp.equals("na") || resp.equals("nn")) {
                c2.desligar();
                break;
            } else {
                System.out.print("ERRO: Por favor, escreva 'sim' ou 'não' " +
                        "para continuar (ou s/n):  ");
            }
        }

    while (true) {
        while (true) {
            System.out.print("Deseja aumentar ou diminuir o volume ? (A ou D): ");
            String resp2 = sc.nextLine().toUpperCase();
            if (resp2.equals("A")) {
                c2.maisVolume();
                break;
            } else if (resp2.equals("D")) {
                c2.menosVolume();
                break;
            } else {
                System.out.print("ERRO: Por favor, digite uma opção válida: ");
                sc.nextLine();
            }
        }

        c2.abrirMenu();

        System.out.print("Deseja continuar ? ");
        String resp3 = sc.nextLine().toLowerCase();
        if (resp3.equals("sim") || resp3.equals("si")
                || resp3.equals("ss") || resp3.equals("s")) {
            continue;
        }
        else if (resp3.equals("não") || resp3.equals("nao")
                || resp3.equals("nã") || resp3.contains("na")
                || resp3.equals("nn") || resp3.equals("n")) {
            break;
        }
    }
        System.out.println("Encerrando programa. Muito obrigado!");
        sc.close();
    }
}
