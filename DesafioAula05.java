package aulasjavapoo;
import java.util.Scanner;

public class DesafioAula05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjetoAula05 obj = new ObjetoAula05();

        System.out.print("Digite seu nome: ");
        obj.setDonoConta(sc.nextLine()); // Pois é um nome com espaço

        System.out.print("Digite um número de conta: ");
        obj.numConta = sc.nextInt();

        System.out.print("Digite um tipo de conta (CC ou CPP): ");
        obj.setTipConta(sc.next()); // Não necessita de espaço, logo uso somente next
        if (obj.getTipConta().equals("CC") || obj.getTipConta().equals("cc")) {
            System.out.println("Conta corrente criada com sucesso!");
            obj.abrirConta(obj.getTipConta());
        }
        else if (obj.getTipConta().equals("CPP") || obj.getTipConta().equals("cpp")) {
            System.out.println("Conta poupança criada com sucesso!");
            obj.abrirConta(obj.getTipConta());
        }

        while (true) {
            System.out.println();
            System.out.print("O que você deseja fazer ?" +
                             "\n1- Abrir conta" +
                             "\n2- Fechar conta" +
                             "\n3- Depositar" +
                             "\n4- Sacar" +
                             "\n5- Finalizar");

            System.out.print("\nEscolha uma opção: ");
            int opc = sc.nextInt();

            if (opc == 1) {
                obj.setStatusConta(true);
                if (!obj.getStatusConta()) {
                    obj.abrirConta(obj.getTipConta());
                    System.out.println();

                    System.out.println("Informações da conta: ");
                    System.out.println("Dono da conta: " + obj.getDonoConta());
                    System.out.println("Número da conta: " + obj.getNumConta());
                    System.out.println("Tipo da conta (CC ou CPP): " + obj.getTipConta());
                }
                else {
                    System.out.println("Conta já existente.");
                }
            }
            else if (opc == 2) {
                obj.setStatusConta(false);
                obj.fecharConta();
            }
            else if (opc == 3) {
                System.out.print("Quanto você deseja depositar ? ");
                obj.depositar(sc.nextDouble());
            }
            else if (opc == 4) {
                System.out.print("Quanto você deseja sacar ? ");
                obj.sacar(sc.nextDouble());
                System.out.println();
            }
            else if (opc == 5) {
                System.out.println("Encerrando serviço.");
                break;
            }
        }

    }
}
