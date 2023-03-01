package exercicio3;
import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		String valor= in.nextLine();
		
		Long valorl=Long.valueOf(valor);
		
		if(valorl%2==0) {
			System.out.printf("O valor "+ valorl+" é par!");
		}
		else if(valorl%2!=0) {
			System.out.printf("O valor "+ valorl+" é impar!");
		}
		
	}

}
