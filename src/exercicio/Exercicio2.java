package CondicionalSwitch;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int cargo;
		float salario, reajuste;
		
		System.out.print("Nome do colaborador:");
		nome = leia.nextLine();
		
		System.out.print("Cargo:");
		cargo = leia.nextInt();
		
		System.out.print("Salario:");
		salario = leia.nextFloat();
		
		switch (cargo) {
		case 1:
			
		reajuste = 10f/100f;	
		
		System.out.print("Nome: " + nome + "\nCargo: Gerente\n");
		System.out.printf("Salario: R$ %.2f", salario + (salario*reajuste));
		
		
		break;
		
		case 2:
			reajuste = 7f/100f;
			System.out.print("Nome:" + nome + "\nCargo:Vendedor\n");
			System.out.printf("Salario: R$ %.2f", salario + (salario*reajuste));
		
		break;
		
		case 3:
			reajuste = 9f/100f;
			System.out.print("Nome:" + nome + "\nCargo:Supervisor\n");
			System.out.printf("Salario: R$ %.2f", salario + (salario*reajuste));

		break;
		
		case 4:
			reajuste = 6f/100f;
			System.out.print("Nome:" + nome + "\nCargo:Motorista\n");
			System.out.printf("Salario: R$ %.2f", salario + (salario*reajuste));
			
		break;
		
		case 5:
			reajuste = 5f/100f;
			System.out.print("Nome:" + nome + "\nCargo:Estoquista\n");
			System.out.printf("Salario: R$ %.2f", salario + (salario*reajuste));

		break;
		
		case 6:
			reajuste = 8f/100f;
			System.out.print("Nome:" + nome + "\nCargo:Técnico de TI\n");
			System.out.printf("Salario: R$ %.2f", salario + (salario*reajuste));
			
		break;
	} 
		
		
	
	}

}
