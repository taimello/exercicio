package exercicio;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {

		float bruto, adnoturno, extra, desconto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salario bruto: ");
		bruto = leia.nextFloat();
		
		System.out.print("Adicional Noturno:");
		adnoturno = leia.nextFloat();
		
		System.out.print("Horas extras:");
		extra = leia.nextFloat();
		
		System.out.print("Descontos:");
		desconto = leia.nextFloat();
		
		//saida com soma, subtraçao e multiplicação 
		
		System.out.printf("O salario liquido é: %.2f",  
		(bruto+adnoturno+(extra*5)-desconto));
	}

}
