package exercicio;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nota 1:");
		nota1 = leia.nextFloat();
		
		System.out.print("Nota 2:");
		nota2 = leia.nextFloat();
		
		System.out.print("Nota 3:");
		nota3 = leia.nextFloat();
		
		System.out.print("Nota 4:");
		nota4 = leia.nextFloat();
		
		//saida com soma e media
		
		System.out.printf("A média do aluno é:%.1f", 
		(nota1+nota2+nota3+nota4)/4);
		
		

	}

}
