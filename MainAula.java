package AulaHeranca.exercicio;

public class MainAula {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        Uchiha sasuke = new Uchiha();
        Haruno sakura = new Haruno();
        Hyuga hinata = new Hyuga();
        Boruto boruto = new Boruto();

        // Objeto 1
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Vila da folha";
        naruto.claNinja = "Clã Uzumaki";
        naruto.idade = 32;
        naruto.missao = "Recuperar pergaminho";
        naruto.nivelDaMissao = "B";
        naruto.StatusDaMissao = "Em andamento";

        // Metodos
        naruto.mostrarInfos();
        System.out.println();

        // Boruto
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.aldeia = "Boruto é um Renegado, por isso não pertence a nenhuma aldeia.";
        boruto.idade = 15;

        // Métodos
        System.out.println();
        boruto.mostrarInfos();
        boruto.modoSennin();

    }
}
