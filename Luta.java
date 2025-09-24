package aulasjavapoo;
import java.util.Random;

public class Luta {

    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }

        else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }


    public void lutar() {
        if(aprovada) {
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();

            System.out.println();

            System.out.println("#### Desafiante ###");
            this.desafiante.apresentar();

            Random aleat = new Random();
            int vencedor = aleat.nextInt(3);

            switch (vencedor) {
                case 0: // Empate
                    System.out.println();
                    System.out.print("A luta empatou.");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: // Desafiado venceu
                    System.out.printf("\nO lutador %s venceu!", this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: // Desafiante venceu
                    System.out.printf("\nO lutador %s venceu!", this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }

        else {
            System.out.println("A luta não pôde ocorrer.");
        }
    }


    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }


    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }


    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }


    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}