package ifsc;

public class main {

	public static void main(String[] args) 
	{
		Cachorro Roger=new Cachorro();
		Gato Cleopatra=new Gato();
		
		Roger.setNome("Roger");
		Roger.setRaca("Build Terrier");
		Roger.setCor("Branco");
		Roger.setEcossistema("Quintal");
		Roger.setComprimento((float) 0.58);
		Roger.setNumeroDePatas(4);
		
		Cleopatra.setNome("Cleopatra");
		Cleopatra.setRaca("Sphynx");
		Cleopatra.setCor("Rosa");
		Cleopatra.setEcossistema("Egito");
		Cleopatra.setComprimento((float) 0.5);
		Cleopatra.setNumeroDePatas(4);
		
		System.out.println(Roger.getNome());
		System.out.println(Roger.getRaca());
		System.out.println(Roger.getCor());
		System.out.println(Roger.getEcossistema());
		System.out.println(Roger.getComprimento());
		System.out.println(Roger.getNumeroDePatas());
		Roger.Late();
		
		System.out.println();
		
		System.out.println(Cleopatra.getNome());
		System.out.println(Cleopatra.getRaca());
		System.out.println(Cleopatra.getCor());
		System.out.println(Cleopatra.getEcossistema());
		System.out.println(Cleopatra.getComprimento());
		System.out.println(Cleopatra.getNumeroDePatas());
		Cleopatra.Mia();
	}

}
