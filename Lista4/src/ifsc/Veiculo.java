package ifsc;

public class Veiculo {
	private String Nome;
	private Integer Ano;
	private Integer NumeroDeRodas;
	private String Fabricante;
	private String Cor;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Integer getAno() {
		return Ano;
	}
	public void setAno(Integer ano) {
		Ano = ano;
	}
	public Integer getNumeroDeRodas() {
		return NumeroDeRodas;
	}
	public void setNumeroDeRodas(Integer numeroDeRodas) {
		NumeroDeRodas = numeroDeRodas;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	
}
