package lacoCondicional;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Insira o número A: ");
		a = leia.nextInt();
		
		System.out.print("Insira o número B: ");
		b = leia.nextInt();
		
		System.out.print("Insira o número C: ");
		c = leia.nextInt();
		
		if (a+b == c) {
			System.out.print("A soma de A+B é igual a C");
		}
		
		else if (a+b<c) {
			System.out.print("A soma de A+B é menor que C");
		}
		
		else if (a+b>c) {
			System.out.print("A soma de A+B é maior que C");
		}

	}

}
