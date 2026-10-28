import java.util.Scanner;
import java.util.Locale;

public class Exercicio3_aula60 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {

			double a, b, c;
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}
}