package ifsc;
import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		ArrayList<Veiculo> Vitrine = new ArrayList<Veiculo>();
		Veiculo Corsa=new Veiculo();
		Veiculo Gol=new Veiculo();
		Veiculo Fiesta=new Veiculo();
		
		Corsa.setNome("Corsa");
		Corsa.setAno(2010);
		Corsa.setNumeroDeRodas(4);
		Corsa.setFabricante("Chevrolet");
		Corsa.setCor("Prata");
		
		Gol.setNome("Gol");
		Gol.setAno(2015);
		Gol.setNumeroDeRodas(4);
		Gol.setFabricante("Volkswagen");
		Gol.setCor("Vermelho");
		
		Fiesta.setNome("Fiesta");
		Fiesta.setAno(2016);
		Fiesta.setNumeroDeRodas(4);
		Fiesta.setFabricante("Ford");
		Fiesta.setCor("Azul");
		
		Vitrine.add(Fiesta);
		Vitrine.add(Gol);
		Vitrine.add(Corsa);
		
		int n = Vitrine.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(Vitrine.get(i).getNome());
			System.out.println(Vitrine.get(i).getAno());
			System.out.println(Vitrine.get(i).getCor());
			System.out.println(Vitrine.get(i).getFabricante());
			System.out.println(Vitrine.get(i).getNumeroDeRodas());
		}
	}

}
