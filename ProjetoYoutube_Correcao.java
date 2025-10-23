package ProjetoAula14_Correcao;

public class ProjetoYoutube_Correcao {
    public static void main(String[] args) {

        // Programa principal
        Video_Correcao v[] = new Video_Correcao[3];

        v[0] = new Video_Correcao("Aula 1 de POO");
        v[1] = new Video_Correcao("Aula 12 de PHP");
        v[2] = new Video_Correcao("Aula 10 de HTML5");


        Gafanhoto_Correcao g[] = new Gafanhoto_Correcao[2];

        g[0] = new Gafanhoto_Correcao("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto_Correcao("Creuza", 12, "F", "creuzita");


        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
