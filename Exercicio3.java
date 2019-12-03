import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		 int a[] = new int [10], i;
		 int b[] = new int[10];
		 
		 for (i=0; i<=9; i++) {
			 System.out.println("Digite o " + (i+1)+"º valor: " );
			 a[i] = in.nextInt(); 
			 b[i] = a[i];
		 }
		 
		 for( i= a.length -1; i>=0; i--) {
				System.out.println(b[i]);
		 }
	}

}
