package ProjetoAula14_Correcao;

public class Video_Correcao implements AcoesVideo_Correcao{

    // Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;


    // Metodos
    public Video_Correcao(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }


    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }


    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }


    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }


    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }


    // Metodos sobrepostos
    @Override
    public void play() {
        this.reproduzindo = true;
    }


    @Override
    public void pause() {
        this.reproduzindo = false;
    }


    @Override
    public void like() {
        this.curtidas++;
    }


    @Override
    public String toString() {
        return "Video_Correcao { " +
                "titulo = " + titulo + '\'' +
                ", avaliacao = " + avaliacao +
                ", views = " + views +
                ", curtidas = " + curtidas +
                ", reproduzindo = " + reproduzindo +
                " } ";
    }
}
