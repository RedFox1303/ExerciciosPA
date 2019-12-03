
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maior = 0, menor = 0;
		double[] notas = new double[10];

		System.out.print("digite 10 notas");
		System.out.println();
		for (int a = 0; a < 10; a++) {
			System.out.println("nota " + (a + 1) + " : ");
			notas[a] = in.nextDouble();
		}

		for (int a = 0; a < 10; a++) {
			if (notas[a] > maior) {
				maior = (int) notas[a];
			}
		}
		System.out.print("o maior valor é " + maior);

		for (int a = 0; a < 10; a++) {
			if (notas[a] < menor) {
				menor = (int) notas[a];
			}
		}
		System.out.print("\n e o menor valor é " + menor);
	}

}