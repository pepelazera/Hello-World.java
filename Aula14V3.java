package aulasjava01;

public class Aula14V3 {
    public static void main(String[] arg) {
      String s = "potato apple lemon orange";

      String[] vect = s.split(" ");
      String word0 = vect[0];
      String word1 = vect[1];
      String word2 = vect[2];
      String word3 = vect[3];

      System.out.println(word0);
      System.out.println(word1);
      System.out.println(word2);
      System.out.println(word3);
    }
}