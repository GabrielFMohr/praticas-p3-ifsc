package exercicio14;
import java.util.Scanner;

public class exercicio14 {

	public static Integer menor(Integer numero[]) 
	{
		Integer i,menor = Integer.MAX_VALUE;
		
		for(i=0;i<10;i++)
		{
			if(numero[i]<menor)
			{
				menor=numero[i];
			}
		}
		return menor;
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
	
	Integer menor=menor(v);
	
	System.out.println(menor);
	}
}