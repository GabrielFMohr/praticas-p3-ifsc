package exercicio8;
import java.util.Scanner;

public class exercicio8 {

	public static Integer soma(Integer primeiro[]) 
	{
		int i;
		Integer soma=0;
		
		for(i=0;i<10;i++)
		{
			soma=soma+primeiro[i];
		}
		
		return soma;
		
	}
	
	public static void main(String[]args) {
		
	Scanner in= new Scanner(System.in);
	int i;
	Integer v[]=new Integer[10];
	
	for(i=0;i<10;i++)
	{
		System.out.printf("Insira um valor para a posição %d do vetor: \n",i);
		v[i]=Integer.valueOf(in.nextLine());
	}
	
	Integer soma=soma(v);
	System.out.println("A soma dos valores do vetor foi "+ soma);
	}
}
