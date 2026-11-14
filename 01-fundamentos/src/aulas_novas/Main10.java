import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;

public class Main10 {
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

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));


        JOptionPane.showMessageDialog(null, "A idade é: " + idade);
        JOptionPane.showMessageDialog(null, "A altura é: " + altura);

        System.out.println("A altura é:" + altura);

        sc.close();
    }
}
