import java.util.Locale;
import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {

        /* tipos primimitos*/
        /* .... */
        /* Classes wrapper */
        /* .... */
        /* Operadores básicos */
        /* .... */
        /* Operador lógico*/
        /* .... */
        /* Estruturas condicionais - IF e ELSE */
        /* .... */
        /* Operadores ternários */
        /* .... */
        /*  Como usar o Switch Legacy */
        /* .... */
        /* Switch-Case-Inicialization */
        /* .... */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = sc.nextInt();

        System.out.println("Digite a altura:");
        double altura = sc.nextDouble();

        System.out.println("A idade é:" + idade);
        System.out.println("A altura é:" + altura);

        sc.close();
    }
}
