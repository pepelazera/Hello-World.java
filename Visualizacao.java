package ProjetoAula14;

import java.util.Scanner;

public class Visualizacao {
    Scanner sc = new Scanner(System.in);
    private String espectador;
    private String filme;


    // Metodos
    public void avaliar() {

        while (true) {
            System.out.println("\nDeixe sua avaliacao por escrito abaixo...");

            System.out.print("\nSua avaliacao do video eh positiva ou negativa ? ");
            String avalEscrita = sc.nextLine().toLowerCase();

            if (avalEscrita.equals("positiva")) {

                System.out.println("\nFicamos felizes! Iremos armazenar seu feedback.");
                break;

            }

            else if (avalEscrita.equals("negativa")) {

                System.out.println("\nEntendo... obrigado pelo feedback, iremos sugerir melhoras!");
                break;

            }

            else {

                System.out.println("\nERROR: Por favor, escreva 'positivo' ou 'negativo' para continuar a avaliacao.");

            }

            sc.close();
        }
    }


    public void avaliar(int nota) {

        while (true) {
            System.out.print("De uma nota de 0 a 5 para o video que voce viu: ");
            nota = sc.nextInt();


            if (nota < 2) {
                System.out.println("Avaliacao negativa.");
                break;

            } else if (nota < 4) {
                System.out.println("Avaliacao mediana.");
                break;

            } else if (nota <= 5) {
                System.out.println("Avaliacao Positiva");
                break;

            } else {
                System.out.println("ERRO: Por favor, avalie com somente de 0 a 5: ");
            }

            sc.close();
        }
    }


    public void avaliar(float porcentagem) {

    }


    // Getter e Setters
    public String getEspectador() {
        return espectador;
    }
    public void setEspectador(String espectador) {
        this.espectador = espectador;
    }



    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

}
