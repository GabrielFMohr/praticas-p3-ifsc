package exercicio11;
import java.util.Scanner;

public class exercicio11 {

	public static double soma(Double primeiro, Double segundo) 
	{
		Double soma=primeiro+segundo;
		return soma;
	}
	
	public static void main(String[]args) {
		
	Scanner in= new Scanner(System.in);
	System.out.println("Insira o primeiro número: ");
	Double primeiro=Double.valueOf(in.nextLine());
	
	System.out.println("Insira o segundo número: ");
	Double segundo=Double.valueOf(in.nextLine());
	
	Double soma=soma(primeiro,segundo);
	
	System.out.printf("A soma dos valores inseridos foi: %.2f",soma);
	}
	 
}