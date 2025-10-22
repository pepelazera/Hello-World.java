import java.util.Scanner;

public class Gafanhoto extends Pessoa {
    // Atributos
    private String login;
    private int totAssistido;


    // Metodos
    public void viuMaisUm() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos videos a mais voce viu ? ");
        int viuMaisUmV = sc.nextInt();


        while (true) {

            if (viuMaisUmV > 0) {
                this.setTotAssistido(this.getTotAssistido()+viuMaisUmV);

                System.out.println("Total assistido: "+this.getTotAssistido());
                break;
            }

            else if (viuMaisUmV == 0) {
                System.out.println("Quantidade total assistida "+this.getTotAssistido());
                break;
            }

            else {
                System.out.println("ERRO: Por favor, escreva novamente: ");
            }
        }

        sc.close();
    }


    public void cadastroPessoa() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Deseja cadastrar uma pessoa ? (S/N): ");
            String resp = sc.next().toLowerCase();

            if (resp.equals("sim") || resp.equals("ss") || resp.equals("s")) {
                System.out.println("=== Cadastro Novo Gafanhoto ===");

                System.out.print("Nome: ");
                this.setNome(sc.nextLine());
                this.setNome(sc.nextLine());

                System.out.print("Idade: ");
                this.setIdade(sc.nextInt());

                System.out.print("Sexo: ");
                this.setSexo(sc.next());

                System.out.print("Tempo de experiencia: ");
                this.setExperiencia(sc.nextInt());

                System.out.println();
                this.status();

                break;
            }

            else if (resp.equals("nao") || resp.equals("não")
            || resp.equals("nn") || resp.equals("n")) {
                System.out.println("Entendido! Obrigado por utilizar nosso sistema! Aqui estão suas informações: ");

                this.status();
                break;
            }

            else {
                System.out.println("ERRO: Por favor, escreva 'sim' ou 'nao' para continuar: ");
            }
        }
    }


    // Getters e Setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }


    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
