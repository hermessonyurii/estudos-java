package exerciciosDoCurso3;

import java.util.Locale;
import java.util.Scanner;

public class ValorPecas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1 = sc.nextInt();
        int qtdPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codPeca2 = sc.nextInt();
        int qtdPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double total = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}
