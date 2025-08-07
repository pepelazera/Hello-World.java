package aulasjava01;

public class Aula13EstRepsPart03 {
    public static void main (String[] arg) {
        for (int cc = 15; cc >= 5; cc-=2) { // Caso eu queira fazer de 15 até 5 (descrescente) pulando de 2 em 2
            System.out.println(cc);

            /* O que foi feito logo acima
               é a mesma coisa que:
                                    int cc = 0
                                    while (cc<4) {
                                        System.out.printf("Cambalhota %s\n", cc);
                                        cc++;
             */
        }
    }
}
