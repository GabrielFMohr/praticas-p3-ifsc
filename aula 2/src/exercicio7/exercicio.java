package exercicio7;

public class exercicio {

	public static void main(String[] args) {
		String x[]=new String[10];
		
		for(int u=0;u<10;u++)
		{
			x[u]=String.valueOf(u);
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.printf("Valor "+i+": "+Integer.valueOf(x[i]));
			System.out.println("");
		}
		
	}
}