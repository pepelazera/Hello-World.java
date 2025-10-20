package aulasjavapoo;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {

        if (frase.equals("toma a comida") || frase.equals("Toma a comida")
                || frase.equals("Ola") || frase.equals("ola")) {
            System.out.println("Abanar e latir");
            this.emitirSom();
        }
        else {
            System.out.println("Rosnar");
        }
    }


    public void reagir(int hora, int min) {

        if (hora < 12) {
            System.out.println("Abanar");
        }
        else if (hora >= 18) {
            System.out.println("Ignorar");
        }
        else {
            System.out.println("Abanar e latir");
        }

    }


    public void reagir(boolean dono) {

        if (dono) {
            System.out.println("Abanar");
        }
        else {
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }

    }


    public void reagir(int idade, float peso) {

        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            }
            else {
                System.out.println("Latir");
            }
        }
        else if (peso < 10) {
            System.out.println("Rosnar");
        }
        else {
            System.out.println("Ignorar");
        }

    }


    
    /*
    public void reagir(int x, int y) {} // Essa linha eh um erro gigantesco, isso porque
                                            já existe uma assinatura com dois ints, logo,
                                            esse metodo daria erro caso não estivesse comentado
     */
}
