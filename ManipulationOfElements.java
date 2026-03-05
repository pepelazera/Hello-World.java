package Exercises;

public class ManipulationOfElements {
    public static void main(String[] args) {

        String[] characters;
        characters = new String[]{"Luffy", "Zoro", "Sanji", "Chopper", "Nami", "Robin"};

        String[] reverseCharacters = new String[6];

        System.out.print("[");
        for (String character : characters) {
            System.out.print(character);

            if (character.equals("Robin")) {
                System.out.print("");
            }
            else {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println();
        for (int i = 0; i < characters.length; i++) {
            reverseCharacters[i] = characters[characters.length - 1 - i];
        }

        System.out.print("[");
        for (String reverseCharacter : reverseCharacters) {
            System.out.print(reverseCharacter);

            if (reverseCharacter.equals("Luffy")) {
                System.out.print("");
            }
            else {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}


