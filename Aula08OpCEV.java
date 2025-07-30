package aulas;

public class Aula08OpCEV {
    public static void main(String[] arg) {
        /*
        int n1, n2;
        n1 = 14;
        n2 = 8;
        int r = (n1 > n2) ? n1+n2 : n1-n2;
        System.out.println(r);
         */

        String n1 = "Lazera";
        String n2 = "Gustavo";
        String n3 = new String("Gustavo"); /* Como esse objeto foi intanciado utilizando o new,
                                                    eles tecnicamente não tem a mesma estrutura do valor
                                                    de cima
                                                    */
        String res1;
        String res2;

        res1 = (n2==n3)?"Igual":"Diferente"; // Aqui ele diz que eles são diferentes por conta das suas classes
        res2 = (n2.equals(n3))?"Igual":"Diferente"; // Aqui ele diz que são iguais pois está idenficando que o conteúdo dentro das classes é igual

        System.out.println(res1);
        System.out.println(res2);
    }
}
