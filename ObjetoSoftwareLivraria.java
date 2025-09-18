package aulasjavapoo;
import java.util.Scanner;

public class ObjetoSoftwareLivraria {
    Scanner sc = new Scanner(System.in);

    private int minRomance = 15;
    private int minSuspense = 10;
    private int minClassico = 12;
    private int minFiccao = 14;

    private int totalLivros;
    private int porcentagem;

    private int romance;
    private int suspense;
    private int classico;
    private int ficcao;

    public void construtor1() {
        System.out.print("Título: ");
        String titulo = sc.next().toLowerCase();

        System.out.print("Gênero: ");
        String genero = sc.next().toLowerCase();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        if (genero.equals("romance")) {
            this.setRomance(getRomance() + quantidade);
        }
        else if (genero.equals("suspense")) {
            this.setSuspense(getSuspense() + quantidade);
        }
        else if (genero.equals("clássico") || genero.equals("classico")) {
            this.setClassico(getClassico() + quantidade);
        }
        else if (genero.equals("ficção") || genero.equals("ficcao") ||
                genero.equals("ficcão") || genero.equals("ficçao")) {
            this.setFiccao(getFiccao() + quantidade);
        }

        this.setTotalLivros(getTotalLivros() + quantidade);
    }

    public void construtor2() {
        System.out.print("Título: ");
        String titulo2 = sc.next().toLowerCase();

        System.out.print("Gênero: ");
        String genero2 = sc.next().toLowerCase();

        System.out.print("Quantidade: ");
        int quantidade2 = sc.nextInt();
        if (genero2.equals("romance")) {
            this.setRomance(getRomance() + quantidade2);
        }
        else if (genero2.equals("suspense")) {
            this.setSuspense(getSuspense() + quantidade2);
        }
        else if (genero2.equals("clássico") || genero2.equals("classico")) {
            this.setClassico(getClassico() + quantidade2);
        }
        else if (genero2.equals("ficção") || genero2.equals("ficcao") ||
                genero2.equals("ficcão") || genero2.equals("ficçao")) {
            this.setFiccao(getFiccao() + quantidade2);
        }
    }

    public void quantMinima() {
        if(this.getRomance() < this.getMinRomance()) {
            System.out.println("Livros de romance abaixo da média esperada: "+this.getRomance());
        }
        else {
            System.out.println("Livros de romance dentro da média: "+this.getRomance());
        }

        if(this.getSuspense() < this.getMinSuspense()) {
            System.out.println("Livros de suspense abaixo da média esperada: "+this.getSuspense());
        }
        else {
            System.out.println("Livros de suspense dentro da média: "+this.getSuspense());
        }

        if(this.getClassico() < this.getMinClassico()) {
            System.out.println("Livros clássicos abaixo da média esperada: "+this.getClassico());
        }
        else {
            System.out.println("Livros clássicos dentro da média: "+this.getClassico());
        }

        if(this.getFiccao() < this.getMinFiccao()) {
            System.out.println("Livros de ficção abaixo da média esperada: "+this.getFiccao());
        }
        else {
            System.out.println("Livros de ficção dentro da média: "+this.getFiccao());
        }
    }


    public int getMinRomance() {
        return minRomance;
    }
    public void setMinRomance(int minRomance) {
        this.minRomance = minRomance;
    }


    public int getMinSuspense() {
        return minSuspense;
    }


    public void setMinSuspense(int minSuspense) {
        this.minSuspense = minSuspense;
    }


    public int getMinClassico() {
        return minClassico;
    }
    public void setMinClassico(int minClassico) {
        this.minClassico = minClassico;
    }


    public int getMinFiccao() {
        return minFiccao;
    }
    public void setMinFiccao(int minFiccao) {
        this.minFiccao = minFiccao;
    }


    public int getTotalLivros() {
        return totalLivros;
    }
    public void setTotalLivros(int totalLivros) {
        this.totalLivros = totalLivros;
    }


    public int getRomance() {
        return romance;
    }
    public void setRomance(int romance) {
        this.romance = romance;
    }


    public int getPorcentagem() {
        return porcentagem;
    }
    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }


    public int getSuspense() {
        return suspense;
    }
    public void setSuspense(int suspense) {
        this.suspense = suspense;
    }


    public int getClassico() {
        return classico;
    }
    public void setClassico(int classico) {
        this.classico = classico;
    }


    public int getFiccao() {
        return ficcao;
    }
    public void setFiccao(int ficcao) {
        this.ficcao = ficcao;
    }
}
