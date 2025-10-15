package aulasjavapoo;

public final class Bolsista extends Aluno { // Bolsista nao pode ser sobreposto
    // Atributos
    private float bolsa;


    // Metodos
    public void renovarBolsa() {
        System.out.printf("Renovando bolsa de %s.", this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.printf("%s eh bolsista. Pagamento facilitado.", this.getNome());
    }


    // Metodos especiais
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
