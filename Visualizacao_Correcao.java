package ProjetoAula14_Correcao;

public class Visualizacao_Correcao {
    private Gafanhoto_Correcao espectador;
    private Video_Correcao filme;


    // Metodos
    public Visualizacao_Correcao(Gafanhoto_Correcao espectador, Video_Correcao filme) {

        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);

    }


    public void avaliar() {
        this.filme.setAvaliacao(5);
    }


    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }


    public void avaliar(float porc) {
        int tot = 0;

        if (porc <= 20) {
            tot = 3;
        }

        else if (porc <= 50) {
            tot = 5;
        }

        else if (porc <= 90) {
            tot = 8;
        }

        else {
            tot = 10;
        }

        this.filme.setAvaliacao(tot);
    }


    // Getters e Setters
    public Gafanhoto_Correcao getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto_Correcao espectador) {
        this.espectador = espectador;
    }


    public Video_Correcao getFilme() {
        return filme;
    }
    public void setFilme(Video_Correcao filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return " Visualizacao { " +
                " espectador = " + espectador +
                ", filme = " + filme +
                " } ";
    }
}
