import java.util.Scanner;

public class Exercicio1_aula60 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int i = 1;

		for (i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}