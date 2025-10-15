package aulasjavapoo;

public final class Tecnico extends Pessoa{
    // Atributos
    private int registroPessoal;

    // Metodos
    public void praticar() {
        System.out.printf("%s esta testando o programa da faculdade.", this.getNome());
    }

    // Metodos especiais

    public int getRegistroPessoal() {
        return registroPessoal;
    }
    public void setRegistroPessoal(int registroPessoal) {
        this.registroPessoal = registroPessoal;
    }
}
