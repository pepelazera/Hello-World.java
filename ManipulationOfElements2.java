package Exercises;

import java.util.Arrays;

public class ManipulationOfElements2 {
    public static void main(String[] args) {

        String[] characters;
        characters = new String[]{"Luffy", "Zoro", "Sanji", "Chopper", "Nami", "Robin"};

        String[] inverseCharacters = new String[6];

        for (int i = 0; i < inverseCharacters.length; i++) {
            inverseCharacters[i] = characters[inverseCharacters.length - 1 - i];
        }

        System.out.println(Arrays.toString(characters));
        System.out.println(Arrays.toString(inverseCharacters));
    }
}
