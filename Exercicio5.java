import java.util.Arrays;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0, a[] = new int[10], b[] = new int[10], c[] = new int[10];

		for (i = 0; i < 10; i++) {
			System.out.print("Insira o " + (i + 1) + "° número: ");
			a[i] = in.nextInt();

			b[i] = a[i];
		}
		System.out.println("");
		Arrays.sort(b);

		System.out.println("Em ordem crescente: ");
		for (i = 0; i < 10; i++) {
			System.out.print(b[i] + ", ");

			c[i] = b[i];
		}
		System.out.println("");
		
		System.out.println("Em ordem decrescente:  ");
		for (i = 9; i > -1; i --) {
			System.out.print(c[i] + ", ");

		}

	}
}