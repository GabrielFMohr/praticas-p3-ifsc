package ex;
import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<produto> folheto = new ArrayList<produto>();
		produto a=new produto();
		produto b=new produto();
		produto c=new produto();
		
		a.setNome("Tody");
		a.setCodBarras((long) 000000001);
		a.setPreco(3.68);
		a.setFornecedor("Eu");
		
		b.setNome("Nescau");
		b.setCodBarras((long) 000000002);
		b.setPreco(5.65);
		b.setFornecedor("Ele");
		
		c.setNome("Nesquik");
		c.setCodBarras((long) 000000003);
		c.setPreco(12.69);
		c.setFornecedor("Você");
		
		folheto.add(a);
		folheto.add(b);
		folheto.add(c);
		
		int i=folheto.size();
		for(int n=0;n<i;n++)
		{
			System.out.println(folheto.get(n).getNome());
			System.out.println(folheto.get(n).getCodBarras());
			System.out.println(folheto.get(n).getPreco());
			System.out.println(folheto.get(n).getFornecedor());
			
		}

	}

}
