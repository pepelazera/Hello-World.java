public class Video {

    // Atributos
    private String titulo;
    private boolean avaliacao;
    private int views;
    private int curtidas;


    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public boolean isAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(boolean avaliacao) {
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
}
