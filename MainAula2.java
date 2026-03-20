package AulaPolimorfismo;

import AulaHeranca.exercicio.Uzumaki;

public class MainAula2 {
    public static void main(String[] args) {

        Uzumaki2 naruto = new Uzumaki2();
        naruto.nome = "Naruto Uzumaki";
        naruto.ataqueEspecial = "Hasen Shuriken";
        naruto.tacarUmaShuriken(); // Esse método é obrigatoriamente abstrato
        naruto.habilidadeEspecial();

        System.out.println();

        Uchiha2 sasuke = new Uchiha2();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.ataqueEspecial = "Amaterasu";
        sasuke.habilidadeEspecial();

    }
}
