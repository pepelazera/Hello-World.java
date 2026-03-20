package Desafio4Java10x;

public class Main {
    public static void main(String[] args) {

        // Chamamento usando polimorfismo
        Ninja naruto = new NinjaBasico("Naruto Uzumaki", 15, "Hasengan", TipoHabilidade.NINJUTSU);
        Ninja kakashi = new NinjaAvancado("Kakashi Hatake", 27, "Chidori e Kamui", "Cópia e adaptação de Jutsus", TipoHabilidade.NINJUTSU);
        // Nas duas chamadas, busquei fazer o desafio extra e fiz consultas sobre classe enum. Após entender um pouco sobre, vim aqui e acrescentei-as no código de uma maneira que não interferisse no que foi feito anteriormente

        // Chama os metodos do ninja basico
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        // Chama os metodos do ninja avancado
        kakashi.mostrarInformacoes();
        kakashi.executarHabilidade();

    }
}
