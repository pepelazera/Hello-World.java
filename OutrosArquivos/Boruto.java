package AulaHeranca.exercicio;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    @Override
    public void ativarKarma() {
        System.out.println("O karma foi ativado. Sou um portador da marca dos Otsutsuki");
    }

    @Override
    public void ativarJogan() {
        System.out.println("Jogan foi ativado com sucesso");
    }
}
