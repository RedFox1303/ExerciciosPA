
import java.util.Scanner;

public class Exercicio1 {

			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				
				int i, a[];
				int c = 10;
				double b [];
				
				a = new int [c];
				b = new double [c];
				
				for (i=0; i<c; i++ ) {
					System.out.println("Digite o "+(i+1)+"° valor");
					a[i] = in.nextInt();
			
				}
				System.out.println("");
				
				for (i=0; i<c; i++ ) {
					b[i] = (double) Math.sqrt(a[i]);
					
					System.out.println("A raiz do número " +(i+1)+ " é: "+b[i]);
				
				}
				in.close();
			}	
		

}