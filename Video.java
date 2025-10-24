package ProjetoAula14;

public class Video implements AcoesVideo {
    // Atributos
    private String titulo;
    private boolean avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzir;


    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }


    public void infoVideos() {
        Visualizacao visu = new Visualizacao();

        visu.avaliar();

        System.out.println("=== Informações  do video ===");
        System.out.println("Titulo do video: "+this.getTitulo());
        System.out.println("Avaliação: "+this.getAvaliacao());
        System.out.println("Views: "+this.getViews());
        System.out.println("Likes: "+this.getCurtidas());
        System.out.println("====================================");

    }



    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public boolean getAvaliacao() {
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


    public  boolean getReproduzir() {
        return reproduzir;
    }
    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }
}
