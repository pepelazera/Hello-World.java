package AulaHeranca.exercicio;

public class Main {
    public static void main(String[] args) {

        // Criar ninja Sasuke Uchiha
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Vila da folha";
        naruto.idade = 17;

        // Aplicando metodos ao meu primeiro ninja
        System.out.println("\nInformacoes sobre o Naruto: ");
        naruto.mostrarInfos();
        naruto.ChakraInfinito();
        System.out.println();

        int quantoTempoFaltaProNaruto = naruto.anosParaHokage(35);
        System.out.printf("Voce tem %d anos. Faltam %d anos para voce poder ser Hokage\n", naruto.idade, quantoTempoFaltaProNaruto);


        // Criar ninja Sasuke Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.aldeia = "Vila da folha";
        sasuke.missao = "Encontrar membro da Anbu";
        sasuke.nivelDaMissao = "A";
        sasuke.StatusDaMissao = "Em andamento";
        sasuke.idade = 18;

        // Aplicando metodos ao meu segundo ninja
        System.out.println("\nInformacoes sobre o Sasuke: ");
        sasuke.mostrarInfos();
        sasuke.SharinganAtivado();
        System.out.println();

        int quantoTempoFaltaProSasuke = sasuke.anosParaHokage(35);
        System.out.printf("Voce tem %d anos. Faltam %d anos para voce poder ser Hokage\n",sasuke.idade, quantoTempoFaltaProSasuke);


        // Criar Sakura Haruno
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Vila da Folha";
        sakura.idade = 18;

        // Aplicando metodos ao meu terceiro ninja
        System.out.println("\nInformacoes sobre a Sakura: ");
        sakura.mostrarInfos();
        sakura.CuraAprimorada();
        System.out.println();


        // Criar Hinata Hyuga
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "Vila da Folha";
        hinata.idade = 18;

        // Aplicando metodos ao meu quarto ninja
        System.out.println("\nInformacoes sobre a Hinata: ");
        hinata.mostrarInfos();
        hinata.ByakuganAtivado();
        System.out.println();

    }
}
