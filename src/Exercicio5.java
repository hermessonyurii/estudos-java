import java.util.Scanner;
import java.util.Locale;

public class Exercicio5{
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, quantidadePecas1, codigo2, quantidadePecas2;
		double valorUni1, valorUni2, valorTotal;

		codigo1 = sc.nextInt();
		quantidadePecas1 = sc.nextInt();
		valorUni1 = sc.nextDouble();

		codigo2 = sc.nextInt();
		quantidadePecas2 = sc.nextInt();
		valorUni2 = sc.nextDouble();
				
		valorTotal = (quantidadePecas1 * valorUni1) + (quantidadePecas2 * valorUni2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

		sc.close();
	}
}