import java.util.Scanner;
import java.util.Locale;

public class Exercicio5_aula42 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeProduto = "";
		double precoUnitario = 0.0;
		
		int codigo, quantidade;
		double total = 0.0;
		
		System.out.println("Digite o código do produto (ou 0 para finalizar a compra):");
		codigo = sc.nextInt();
		
		while (codigo != 0) {
			
			System.out.println("Digite a quantidade:");
			quantidade = sc.nextInt();
			
			if (codigo == 1) {
				nomeProduto = "Shawarma";
				precoUnitario = 25.00;
			} else if (codigo == 2) {
				nomeProduto = "Esfirra Aberta";
				precoUnitario = 7.00;
			} else if (codigo == 3) {
				nomeProduto = "Esfirra Fechada";
				precoUnitario = 8.00;
			} else if (codigo == 4) {
				nomeProduto = "Café Árabe";
				precoUnitario = 10.00;
			} else if (codigo == 5) {
				nomeProduto = "Café Normal";
				precoUnitario = 6.00;
			} else if (codigo == 6) {
				nomeProduto = "Pão de queijo";
				precoUnitario = 6.00;
			} else {
				nomeProduto = "Item Inválido";
				precoUnitario = 0.00;
			}
		
			total = total + (quantidade * precoUnitario);
			
			System.out.printf("Item adicionado: código %d = %s (R$ %.2f x %d)%n", codigo, nomeProduto, precoUnitario, quantidade);
			
			System.out.println("------------------------------------");
			System.out.println("Digite o próximo código (ou 0 para finalizar):");
			codigo = sc.nextInt();
		}
		
		System.out.println("====================================");
		System.out.printf("TOTAL DA COMPRA = R$ %.2f%n", total);		
		
		sc.close();
	}
}