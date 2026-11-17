package exerciciosDoCurso;
import java.util.Locale;
import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }

        sc.close();
    }
}
