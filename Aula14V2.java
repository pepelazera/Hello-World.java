package aulasjava01;

public class Aula14V2 {
    public static void main(String[] arg) {
        String original = "abcde FGHIJ ABC abc DEFG     ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2    );
        String s5 = original.substring(2,9);
        String s6 = original.replace("a", "x");
        String s7 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("\nOriginal: -"+original+"-\n");
        System.out.println("toLowerCase: -"+s1+"-\n");
        System.out.println("toUpperCase: -"+s2+"-\n");
        System.out.println("trim: -"+s3+"-\n");
        System.out.println("substring: -"+s4+"-\n");
        System.out.println("susbstring 2: -"+s5+"-\n");
        System.out.println("replace: -"+s6+"-\n");
        System.out.println("replace 2: -"+s7+"-\n");
        System.out.println("Index of 'bc': "+i+"\n");
        System.out.println("lastIndex of 'bc': "+j+"\n");

    }
}
