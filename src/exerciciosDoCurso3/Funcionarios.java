package exerciciosDoCurso3;

import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrab = sc.nextInt();
        double valorHora = sc.nextDouble();
        double totalRecebimento = valorHora*horasTrab;

        System.out.printf("NÚMERO = %d\n", numeroFuncionario);
        System.out.printf("SALÁRIO = R$ %.2f\n", totalRecebimento);

        sc.close();
    }
}
