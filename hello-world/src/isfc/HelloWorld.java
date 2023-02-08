package isfc;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("Digite teu nome: ");
		String nome=in.nextLine();
		System.out.printf("Insira a idade:");
		String IdadeStr=in.nextLine();
		Double idade= Double.valueOf(IdadeStr);
		 System.out.printf(nome + " tem " + idade + " anos");
		
		
	}

}
