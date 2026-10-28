import java.util.Scanner;

public class aula42_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas Horas?");
		hora= sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Boa Manhã");
		}
		else {
			System.out.println("Boa tarde");
		}
		
		sc.close();
	}
 }