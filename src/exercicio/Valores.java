package exercicio;
import java.util.Scanner;
public class Valores {

	public static void main(String[] args) {

		float n1, n2, n3, n4;
		Scanner leia = new Scanner(System.in);
		
		 System.out.print("Numero 1: ");
		 	n1 = leia.nextFloat();
		 	
		 System.out.print("Numero 2: ");
		 	n2 = leia.nextFloat();
		 	
		 System.out.print("Numero 3: ");
		 	n3 = leia.nextFloat();
		 
		 System.out.print("Numero 4: ");
		 	n4 = leia.nextFloat();
		 	
		 // saida de dados e casas decimais depois da virgula
		 	
		 System.out.printf("Diferença do produto: %.1f ", 
				 (n1*n2) - (n3*n4));
		 
		 
		 
		
	}

}
