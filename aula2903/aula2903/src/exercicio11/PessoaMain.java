package exercicio11;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		Pessoa P1=new Pessoa();
		P1.cpf=(long) 4723;
		P1.nome="Arthur";
		P1.DataDeNacsimento="1/01/2001";
		
		Pessoa P2=new Pessoa();
		P2.cpf=(long) 47236;
		P2.nome="João";
		P2.DataDeNacsimento="16/6/1998";
		
		Pessoa P3=new Pessoa();
		P3.cpf=(long) 47238;
		P3.nome="Rodolfo";
		P3.DataDeNacsimento="24/11/2005";
		
		System.out.println("O cpf da pessoa 1 é: "+P1.cpf+"\nO nome da pessoa 1 é "+P1.nome+"\nA data de nascimento da pessoa 1 é "+P1.DataDeNacsimento);
		System.out.println("O cpf da pessoa 2 é: "+P2.cpf+"\nO nome da pessoa 2 é "+P2.nome+"\nA data de nascimento da pessoa 2 é "+P2.DataDeNacsimento);
		System.out.println("O cpf da pessoa 3 é: "+P3.cpf+"\nO nome da pessoa 3 é "+P3.nome+"\nA data de nascimento da pessoa 3 é "+P3.DataDeNacsimento);
		
		

	}

}
