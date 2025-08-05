package aulasjava01;

public class Aula11REstruturasdeRepeticao {
    public static void main(String[] arg) {
        int cc = 0;

        while (cc<10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) { // Vai pular o número 2, 3 e 4
                continue; // Joga para cima do laço
            } else if (cc == 7){
                break; // Sai do looping
            }
            System.out.println("Cambalhota "+ cc);
        }
    }
}
