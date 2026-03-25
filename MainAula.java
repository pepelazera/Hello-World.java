package AulaHerancaMultipla;

public class MainAula {
    static void main() {

        Uzumaki2 naruto = new Uzumaki2();
        naruto.nome = "Naruto Uzumaki";
        naruto.ataqueEspecial = "Hasen Shuriken";
        naruto.idade = 32;
        naruto.HabilidadeEspecial();

        System.out.println();

        Uchiha2 sasuke = new Uchiha2();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 33;
        sasuke.ataqueEspecial = "Amaterasu";
        sasuke.SharinganAtivado();
        sasuke.HabilidadeEspecial();

        System.out.println();

        Uchiha2 itachi = new Uchiha2("Itachi Uchiha", "Renegado", 27, "Amaterasu");
        itachi.HabilidadeEspecial();

        System.out.println();

        Hatake kakashi = new Hatake("Kakashi Hatake","Vila da folha", 48, "Mangekyou Sharingan - Kamui", 265, NivelNinja.JOUNIN);
        kakashi.MostrarInfos();
        kakashi.SharinganAtivado();
        kakashi.MembroDaAnbu();
        kakashi.HokageAtivo();

        System.out.println();

        // Obj uchiha 3
        Uchiha2 madara = new Uchiha2("Madara Uchiha", "Vila da folha", 86, "Rinngegan", 900, NivelNinja.KAGE);
        madara.HabilidadeEspecial();
        madara.MostrarInfos();

    }
}
