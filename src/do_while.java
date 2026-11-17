import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 1;

        do{ //faça

            System.out.println(numero);
            numero++;

        } while (numero <= 5);
    }
}
