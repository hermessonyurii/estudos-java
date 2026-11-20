package programa;

import entidade.FuncionarioEmpresa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        FuncionarioEmpresa hermesson = new FuncionarioEmpresa();

        double salarioComDesconto = hermesson.SalarioFinal(80);
        System.out.println("Salário com desconto: R$ " + salarioComDesconto);

        sc.close();

    }
}