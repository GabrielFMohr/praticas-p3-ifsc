package exercicio12;
import java.util.Scanner;

public class exercicio12 {

	public static Double operacao(Double primeiro, Double segundo, String sinal)
	{
		Double soma=0.0;
		if(sinal.equals("+"))
		{
			soma=primeiro+segundo;
		}
		else if(sinal.equals("-"))
		{
			soma=primeiro-segundo;
		}
		if(sinal.equals("*"))
		{
			soma=primeiro*segundo;
		}
		if(sinal.equals("/"))
		{
			soma=primeiro/segundo;
		}
		return soma;
	}
	
	
	public static void main(String[]args) 
	{
		
		Scanner in= new Scanner(System.in);
		System.out.println("Insira o primeiro número: ");
		Double primeiro=Double.valueOf(in.nextLine());
		
		System.out.println("Insira o segundo número: ");
		Double segundo=Double.valueOf(in.nextLine());
		
		System.out.println("Insira o sinal da operação desejada: ");
		String sinal=in.nextLine();
		
		Double valor=operacao(primeiro,segundo,sinal);
		
		System.out.println(valor);

	}
}
