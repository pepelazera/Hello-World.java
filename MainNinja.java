package AulasHeranca;

import Aulas.NivelNinja;

public class MainNinja {
    public static void main(String[] args) {

        // Obj uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Vila da Folha", 33, "Mangekyou Sharingan ");
        sasuke.MostrarInfos();
        sasuke.SharinganAtivado();

        System.out.println();

        // Obj Kakashi
        Hatake kakashi = new Hatake("Kakashi Hatake", "Vila da Folha", 45, "Kamui");
        kakashi.MostrarInfos();
        kakashi.SharinganAtivado();
        kakashi.MembroDaAnbu();
        kakashi.HokageAtivo();

        // Novo obj Madara

    }
}
