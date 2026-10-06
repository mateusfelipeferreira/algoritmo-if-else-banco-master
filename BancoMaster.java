import java.util.Scanner;

public class BancoMaster {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeFundo;
        double taxaCdb;
        double tetoRegulatorio = 13.0;
        boolean risco = false;

        System.out.print("Digite o nome do fundo de investimento: ");
        nomeFundo = scanner.nextLine();

        System.out.print("Digite a taxa de juros oferecida pelo CDB (%): ");
        taxaCdb = scanner.nextDouble();

        System.out.println();
        System.out.println("-----");
        System.out.println("RELATÓRIO PRELIMINAR:");
        System.out.println("Fundo Analisado: " + nomeFundo);
        System.out.println("Taxa Oferecida: " + taxaCdb + "%");
        System.out.println("Teto Regulatório Permitido: " + tetoRegulatorio + "%");

        if (taxaCdb > tetoRegulatorio) {

            System.out.println();
            System.out.println("[ALERTA CRÍTICO] A taxa do CDB está acima do teto regulatório!");
            System.out.println("Motivo: Captação agressiva para atrair liquidez de forma artificial.");

            risco = true;

        } else {

            System.out.println();
            System.out.println("[REGULAR] A taxa do CDB está dentro do limite permitido.");

            risco = false;
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("PARECER FINAL:");

        if (risco) {

            System.out.println("Parecer do Auditor: Ativo bloqueado para novas emissões.");

        } else {

            System.out.println("Parecer do Auditor: Ativo liberado para comercialização.");
        }

        scanner.close();
    }
}
