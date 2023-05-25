package lacoCondicional;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		if (num % 2 == 0 && num > 0) {
			System.out.print("O Número " + num + " é par e positivo.");
		}else if(num % 2 != 0 && num > 0){
			System.out.print("O Número " + num + " é impar e positivo");
			
		}else if (num % 2 == 0 && num < 0) {
			System.out.print("O Número " + num + " é par e negativo.");

		}else if (num % 2 != 0 && num < 0) {
			System.out.print("O Número " + num + " é impar e negativo.");

		}


	}

}
