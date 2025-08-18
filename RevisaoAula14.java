package aulasjava01;

public class RevisaoAula14 {
    public static void main(String[] args) {
        String original = "   Pedro de Castro Lazera Júnior   ";

        String s1 = original.toLowerCase(); // Todas as letras minúsculas
        String s2 = original.toUpperCase(); // Todas as letras maiúsculas
        String s3 = original.trim(); // Remove espaços em branco no começo e no final da linha
        String s4 = original.substring(8); // Apaga de um ponto x até o local que você numerou no final
        String s5 = original.substring(3, 26); // Vai mostrar de um ponto X que você escolheu, e vai até um ponto Y que você também escolheu
        String s6 = original.replace("Júnior", "Netto"); // Susbtitui uma string por
        int i = original.indexOf("Ped");
        int j = original.lastIndexOf("Laz");

        System.out.println(original+"\n");
        System.out.printf("toLowerCase: %s\n",s1);
        System.out.printf("toUpperCase: %s\n", s2);
        System.out.println();
        System.out.println("trim: -"+s3+"-");
        System.out.println();
        System.out.printf("Substring (primeiro exemplo): %s\n", s4);
        System.out.printf("Substring (segundo exemplo): %s\n", s5);
        System.out.println();
        System.out.printf("replace: %s\n", s6);
        System.out.println();
        System.out.printf("indexOf: %s\n", i);
        System.out.printf("lastIndexOf: %s\n", j);
    }
}
