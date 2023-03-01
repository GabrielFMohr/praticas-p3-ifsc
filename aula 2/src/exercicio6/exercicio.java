package exercicio6;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int i[]= new int[10];
		int m=0,me=99999;
		String l;
		
		for(int x=0;x<10;x++)
		{
			System.out.print("Insira um número para a posição "+x+" do vetor: ");
			l=in.nextLine();
			
			i[x]=Integer.valueOf(l);
			if(i[x]>m)
			{
				m=i[x];
			}
			if(i[x]<me)
			{
				me=i[x];
			}
		}
		System.out.printf("O maior número inserido foi "+m+" e o menor foi "+me);
	}
	
}