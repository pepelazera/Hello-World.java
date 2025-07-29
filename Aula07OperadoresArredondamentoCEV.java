package aulas;

public class Aula07OperadoresArredondamentoCEV {
    public static void main(String[] arg) {
        float v1 = 8.9f;
        int arr = (int) Math.floor(v1);
        System.out.println("Arredondado pra baixo: "+arr);

        float v2 = 8.3f;
        int arr2 = (int) Math.ceil(v2);
        System.out.println("Arredondado pra cima: "+arr2);

        float v3 = 8.3f;
        int arr3 = Math.round(v3);
        System.out.println("\n1° valor arredondado aritimeticamente: "+arr3);

        float v4 = 8.7f;
        int arr4 = Math.round(v4);
        System.out.println("2° valor arredondado aritimeticamente: "+arr4);

        double aleat = 0 + Math.random() * (9);
        System.out.printf("\nO 1° valor aleatório (Entre 0 e 9) gerado foi %.0f.", aleat);

        double aleat2 = 15 + Math.random() * (50-15); /* Para gerar um número aleatório entre 15 e 50 por exemplo,
                                                         o usuário terá que colocar o primeiro valo na frente, que
                                                         nesse caso é o 15, depois somar com o Math.random(), depois
                                                         mutiplicar pela subtração de 50 e 15 como feito acima.      */
        System.out.printf("\nO 2° valor aleatório (Entre 15 e 50) gerado foi %.0f.", aleat2);
    }
}
