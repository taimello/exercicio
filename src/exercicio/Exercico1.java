package CondicionalSwitch;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num, quant;
		float valor;

		System.out.print("Codigo do produto: ");
		num = leia.nextInt();

		System.out.print("Quantidade: ");
		quant = leia.nextInt();

		switch (num) {
		case 1:
			valor = 10;
			System.out.print("Cachorro quente");
			
			System.out.printf("\nValor total: R$ %.2f", (quant * valor));
			
			break;
		
		case 2:
			valor = 15;
			System.out.print("X - salada");
			System.out.printf("\nValor total: R$ %.2f", (quant * valor));

			break;
			
		case 3:
			valor = 18;
			System.out.print("X - bacon");
			System.out.printf("\nValor total: R$ %.2f", (quant * valor));
			
			break;
			
		case 4:
			valor = 12;
			System.out.print("Bauru");
			System.out.printf("\nValor total: R$ %.2f", (quant * valor));

			break;
			
		case 5:
			valor = 8;
			System.out.print("Refrigerante");
			System.out.printf("\nValor total: R$ %.2f", (quant * valor));
			
			break;
			
		case 6:
			valor = 13;
			System.out.print("Suco de laranja");
			System.out.printf("\nValor total: R$ %.2f", (quant * valor));
		break;
		}
		

	}

}
