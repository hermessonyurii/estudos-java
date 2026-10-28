import java.util.Scanner;

public class aula42_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas Horas?");
		hora= sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Boa Manhã");
		}
		else if (hora < 18) {
			System.out.println("Boa Tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		
		sc.close();
	}
 }