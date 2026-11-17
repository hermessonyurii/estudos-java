package exerciciosDoCurso;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        System.out.println("Olá, " + nome);

        sc.close();
    }
}
