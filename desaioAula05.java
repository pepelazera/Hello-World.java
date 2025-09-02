package aulasjavapoo;
import java.util.Scanner;

public class desaioAula05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjetoAula05 obj = new ObjetoAula05();

        System.out.print("Nome do dono da conta: ");
        obj.setDonoConta(sc.nextLine()); // Pois é um nome com espaço

        System.out.print("Número da conta: ");
        obj.numConta = sc.nextInt();

        System.out.print("Tipo da conta (CC ou CPP): ");
        obj.setTipConta(sc.next()); // Não necessita de espaço, logo uso somente next

        System.out.println("Dono da conta: " + obj.getDonoConta());
        System.out.println("Número da conta: " + obj.getNumConta());
        System.out.println("Tipo da conta (CC ou CPP): " + obj.getTipConta());

    }
}
