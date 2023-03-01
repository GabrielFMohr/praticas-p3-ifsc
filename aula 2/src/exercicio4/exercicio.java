package exercicio4;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		String n;
		Integer j;
		for(Integer i=0;i<10;i++)
		{
			System.out.println("Insira um número: ");
			n=in.nextLine();
			j=Integer.valueOf(n);
			System.out.println("O número inserido foi "+n);
		}
		
	}
}
