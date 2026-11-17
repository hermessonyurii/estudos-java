package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class Votacao {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();

        if(idade >= 16){
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }
        sc.close();
    }
}
