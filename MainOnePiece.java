package Exercicio;

public class MainOnePiece {
    public static void main(String[] args) {

        //TODO: String nome, int idade, boolean akumaNoMi, String tripulacao, String raca, String statusSocial
        //TODO: String nome, int idade, boolean akumaNoMi, String tripulacao, String raca, String statusSocial, String nomeAkumaNoMi, TipoAkumaNoMi tipoAkumaNoMi

        // Objeto Luffy
        Personagem luffy = new Personagem("Monkey D. Luffy", 20, true, "Bando do chapeu de palha", "Humano", "Pirata",
                "Hito Hito no Mi - Modelo Nika", TipoAkumaNoMi.ZOAN_MITICA);
        luffy.InfoPersonagem();
        System.out.println();

        System.out.println();
        // Objeto Shanks
        Personagem shanks = new Personagem("Shankes Figarland", 45, false, "Bando do ruivo", "Humano", "Pirata",
                true, true, true,
                true, true, true);
        shanks.InfoPersonagem();

    }
}
