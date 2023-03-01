package exercicio9;
import java.util.Scanner;

public class exercicio9 {
	public static Double abastecimento(Double precoLitro,Double quantidadeLitros) {
		
	Scanner in= new Scanner(System.in);
	
	
	if(quantidadeLitros==1)
	{
		System.out.printf("O valor total do abastecimento será: R$",quantidadeLitros*precoLitro);
	}
	else if(quantidadeLitros==0)
	{
		System.out.printf("Valor nulo inválido!");
	}
	return quantidadeLitros*precoLitro;
	}
}
