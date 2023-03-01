package Exercicio2;
import java.util.Scanner;

public class exercicio {

	public static void main(String[]args) {
		
	Scanner in= new Scanner(System.in);
	
	System.out.println("Insira seu nome: ");
	String nome= in.nextLine();
	System.out.println("Insira sua idade: ");
	String idade= in.nextLine();
	
	Integer idadei=Integer.valueOf(idade);
	
	System.out.printf("O nome inserido foi "+ nome +" e a idade inserida foi " + idadei);
	}
	
}