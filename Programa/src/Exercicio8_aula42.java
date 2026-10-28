import java.util.Scanner;
import java.util.Locale;

public class Exercicio8_aula42 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto = 0;
		
		if (salario >= 0.0 && salario <= 2000.00) {
			imposto = 0.0;
		} 
		
		else if (salario >= 2000.01 && salario <= 3000.00) {
			imposto = (salario - 2000.0) *0.08;
		}
		
		else if (salario >= 3000.01 && salario <= 4500.00) {
			imposto = 80.0 + (salario - 3000.0) *0.18;
		}
		
		else if (salario >= 4500.01) {
			imposto = 80.0 + 270 +(salario - 4500.0) *0.28;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}