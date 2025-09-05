package aulasjavapoo;
import java.util.Scanner;

public class DesafioAula05V2 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        Scanner sc = new Scanner(System.in);

        // Primeira conta
        p1.setNumConta(4225);

        System.out.print("Nome do dono da conta: ");
        p1.setDono(sc.nextLine());

        System.out.print("Tipo da conta (CC ou CPP): ");
        p1.abrirConta(sc.next().toUpperCase());
        while (!p1.getTipo().equals("CC") && !p1.getTipo().equals("CPP")) {
            System.out.print("ERRO: Por favor, digite CC ou CPP para continuar: ");
            p1.abrirConta(sc.next().toUpperCase());
        }

        System.out.print("Você deseja sacar ou depositar ? ");
        String resp = sc.next().toLowerCase();

        while (!resp.equals("sacar") && !resp.equals("depositar")) {
            System.out.print("ERRO: Por favor, digite 'sacar' ou 'depositar' para continuar: ");
            resp = sc.next().toLowerCase();
        }
        if (resp.equals("sacar")) {
            System.out.print("Valor do saque: ");
            p1.sacar(sc.nextFloat());
        }
        else {
            System.out.print("Valor do depósito: ");
            p1.depositar(sc.nextFloat());
        }

        System.out.println();

        // Segunda conta
        ContaBanco p2 = new ContaBanco();
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Nome do dono da conta: ");
        p2.setDono(sc2.nextLine());

        System.out.print("Tipo da conta (CC ou CPP): ");
        p2.abrirConta(sc2.nextLine().toUpperCase());
        while (!p2.getTipo().equals("CC") && !p2.getTipo().equals("CPP")) {
            System.out.println("ERRO: Por favor, digite CC ou CPP para continuar: ");
            p2.abrirConta(sc.next().toUpperCase());
        }

        System.out.print("Você deseja sacar ou depositar ? ");
        String resp2 = sc.next().toLowerCase();
        while (!resp2.equals("sacar") && !resp2.equals("depositar")) {
            System.out.print("ERRO: Por favor, digite 'sacar' ou 'depositar' para continuar: ");
            resp2 = sc.next().toLowerCase();
        }
        if (resp2.equals("sacar")) {
            System.out.print("Valor do saque: ");
            p2.sacar(sc.nextFloat());
        }
        else {
            System.out.print("Valor do depósito: ");
            p2.depositar(sc.nextFloat());
        }

        System.out.println();
        p1.estadoAtual();
        p1.pagarMensal();

        System.out.println();

        p2.estadoAtual();
        p2.pagarMensal();
    }
}
