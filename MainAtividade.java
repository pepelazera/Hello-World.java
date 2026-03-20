package AulaHeranca.exercicio;

import java.util.Scanner;

public class MainAtividade {
    public static void main(String[] args) {

        Scanner ct = new Scanner(System.in);

        Ninja ninja = new Ninja();
        Uzumaki uzumaki = new Uzumaki();
        Uchiha uchiha = new Uchiha();
        Haruno haruno = new Haruno();
        Hyuga hyuga = new Hyuga();

        while (true) {
            System.out.println("Digite as seguintes informações sobre o ninja: ");

            System.out.print("Nome: ");
            ninja.nome = ct.nextLine();

            System.out.print("Aldeia: ");
            ninja.aldeia = ct.nextLine();

            System.out.print("Clã: ");
            ninja.claNinja = ct.nextLine().toLowerCase();

            System.out.print("Idade: ");
            ninja.idade = ct.nextInt();

            ct.nextLine();
            System.out.print("Missão: ");
            ninja.missao = ct.nextLine();

            System.out.print("Nível da missão: ");
            ninja.nivelDaMissao = ct.nextLine();

            System.out.print("Status da missão: ");
            ninja.StatusDaMissao = ct.nextLine();
            System.out.println();

            switch (ninja.claNinja) {
                case "uzumaki" -> {
                    uzumaki.nome = ninja.nome;
                    uzumaki.aldeia = ninja.aldeia;
                    uzumaki.claNinja = ninja.claNinja;
                    uzumaki.idade = ninja.idade;
                    uzumaki.missao = ninja.missao;
                    uzumaki.nivelDaMissao = ninja.nivelDaMissao;
                    uzumaki.StatusDaMissao = ninja.StatusDaMissao;
                }
                case "uchiha" -> {
                    uchiha.nome = ninja.nome;
                    uchiha.aldeia = ninja.aldeia;
                    uchiha.claNinja = ninja.claNinja;
                    uchiha.idade = ninja.idade;
                    uchiha.missao = ninja.missao;
                    uchiha.nivelDaMissao = ninja.nivelDaMissao;
                    uchiha.StatusDaMissao = ninja.StatusDaMissao;
                }
                case "haruno" -> {
                    haruno.nome = ninja.nome;
                    haruno.aldeia = ninja.aldeia;
                    haruno.claNinja = ninja.claNinja;
                    haruno.idade = ninja.idade;
                    haruno.missao = ninja.missao;
                    haruno.nivelDaMissao = ninja.nivelDaMissao;
                    haruno.StatusDaMissao = ninja.StatusDaMissao;
                }

                case "hyuga" -> {
                    hyuga.nome = ninja.nome;
                    hyuga.aldeia = ninja.aldeia;
                    hyuga.claNinja = ninja.claNinja;
                    hyuga.idade = ninja.idade;
                    hyuga.missao = ninja.missao;
                    hyuga.nivelDaMissao = ninja.nivelDaMissao;
                    hyuga.StatusDaMissao = ninja.StatusDaMissao;
                }
            }

            System.out.print("Deseja cadastrar um novo Ninja ? ");
            String resp = ct.nextLine().toLowerCase();

            System.out.println();
            if (resp.equals("ss") || resp.equals("sim") || resp.equals("s")) {
                continue;

            } else if (resp.equals("nn") || resp.equals("nao")
                    || resp.equals("n") || resp.equals("não")) {

                switch (ninja.claNinja) {
                    case "uzumaki" -> uzumaki.mostrarInfos();
                    case "uchiha" -> uchiha.mostrarInfos();
                    case "haruno" -> haruno.mostrarInfos();
                    case "hyuga" -> hyuga.mostrarInfos();
                }

                System.out.println();
                break;
            }

            else {
                System.out.print("ERRO: Por favor, digite 's' ou 'n' para continuar/finalizar o programa: ");
                resp = ct.nextLine().toLowerCase();

                if (resp.equals("ss") || resp.equals("sim") || resp.equals("s")) {
                    continue;

                } else if (resp.equals("nn") || resp.equals("nao")
                        || resp.equals("n") || resp.equals("não")) {
                    System.out.println();

                    break;
                }
            }
        }

        ct.close();
    }
}
