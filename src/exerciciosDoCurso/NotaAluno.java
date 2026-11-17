package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota do aluno: ");
        double nota = sc.nextDouble();

        if(nota >= 6.0){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
