package aulasjava01;
import java.util.Scanner;

public class Desafio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write a word: ");
        String word1 = sc.nextLine();
        System.out.println();

        palindrome(word1); // Call the function at the original program

        sc.close();
    }

    public static void palindrome(String words) {
        String formatedWords = words.replaceAll("\\s+", "").toLowerCase(); // To help on the read
        String invertedWords = new StringBuilder(words).reverse().toString(); // Create a new word but inverted
        String formateInvertedWords = invertedWords.replaceAll("\\s+", "").toLowerCase(); // To help on the read too
        if (formatedWords.equals(formateInvertedWords)) { // If the word are not the same of your inverted version, the program will show false, else, will show true
            System.out.println("Original word: "+words);
            System.out.println("Inverted word: "+invertedWords);
            System.out.println("true");
        }
        else {
            System.out.println("Original word: "+words);
            System.out.println("Inverted word: "+invertedWords);
            System.out.println("false");
        }
    }
}
