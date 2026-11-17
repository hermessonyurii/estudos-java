package exerciciosDoCurso;

import java.util.Locale;
import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if(numero<0){
            System.out.println("NUMERO NEGATIVO");
        } else if(numero>0){
            System.out.println("NUMERO POSITIVO");
        } else {
            System.out.println("NUMERO 0 SELECIONADO");
        }

        sc.close();
    }
}
