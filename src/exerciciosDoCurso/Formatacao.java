package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class Formatacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco = 130.59;
        int idade = 34;
        String nome = "Hermesson";

        System.out.printf("%.2f\n", preco);
        System.out.printf("%.4f\n", preco);

        System.out.printf("O preço dessa mercadoria é: $ %.2f\n", preco);
        System.out.printf("Idade é : %d\n", idade);
        System.out.printf("O nome é: %s\n", nome);
        System.out.printf("O preço da mercadoria é $%.2f e o cliente é %s e ele tem %d anos de idade. \n", preco, nome, idade);
    }
}
