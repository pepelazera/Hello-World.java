package Aulas;

public class MainAula {
    static void main() {

        Uzumaki2 naruto = new Uzumaki2();
        naruto.nome = "Naruto Uzumaki";
        naruto.ataqueEspecial = "Hasen Shuriken";
        naruto.idade = 32;
        naruto.habilidadeEspecial();

        System.out.println();

        Uchiha2 sasuke = new Uchiha2();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 33;
        sasuke.ataqueEspecial = "Amaterasu";
        sasuke.habilidadeEspecial();

        System.out.println();

        Uchiha2 itachi = new Uchiha2("Itachi Uchiha", "Renegado", 27, "Amaterasu");
        itachi.habilidadeEspecial();

    }
}
