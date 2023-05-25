package exercicio;
import java.util.Scanner;
public class AulaJava {

	public static void main(String[] args) {
		//variaveis 
		float salario, abono;
		
		Scanner leia = new Scanner(System.in);
		//entrada e saida de informacoes
		System.out.print("Digite o salario: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o Abono:");
		abono = leia.nextFloat();
		// saida com soma
		System.out.printf("O salario total é: %.2f ", (salario+abono));
		
			
	}

}
///