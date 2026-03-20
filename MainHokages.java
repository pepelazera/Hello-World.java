package AulaPolimorfismo;

public class MainHokages {
    public static void main(String[] args) {

        Senju hashirama = new Senju("Hashirama Senju", 45, false);
        hashirama.mostrarInfos();
        hashirama.sabedoriaHokage();

        // Classes abstratas não podem ser instanciadas
        Senju tobirama = new Senju("Tobirama Senju", 38, false);
        tobirama.mostrarInfos();
        tobirama.sabedoriaHokage();

    }
}
