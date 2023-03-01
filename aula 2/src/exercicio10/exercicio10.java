package exercicio10;
import java.util.Scanner;

public class exercicio10 {
	
	public static Double media(Double nota1,Double nota2,Double nota3)
	{
		return (nota1+nota2+nota3)/3;
	}
	
	public static void main(String[]args) {
		
	Scanner in= new Scanner(System.in);
	
	System.out.println("Insira a primeira nota: ");
	Double nota1=Double.valueOf(in.nextLine());
	
	System.out.println("Insira a segunda nota: ");
	Double nota2=Double.valueOf(in.nextLine());
	
	System.out.println("Insira a terceira nota: ");
	Double nota3=Double.valueOf(in.nextLine());
	
	Double media=media(nota1,nota2,nota3);
	
	if(media<4)
	{
		System.out.println("Aluno reprovado!\n");
	}
	else if(media<6&&media>=4)
	{
		System.out.println("Aluno em recuperação!\n");
	}
	else if(media>=6) 
	{
		System.out.println("Aluno aprovado!\n");
	}
	}
}

