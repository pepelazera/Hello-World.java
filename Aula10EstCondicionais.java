package aulas;
import java.util.Scanner;

public class Aula10EstCondicionais {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Qual seu ano de nascimento ? ");
        int a = keyboard.nextInt();
        int i = 2025 - a;

        if (i < 16) {
            System.out.println("Você tem "+ i+" anos, logo, ainda não pode votar.");
        } else if ((i >= 16 && i < 18) || (i>70)) {
                System.out.println("Você tem "+i+" anos, logo, seu voto é opcional.");
            } else {
                System.out.println("Você tem "+i+" anos, logo, seu voto é obrigatório.");
            }
        }
    }