package controle;

import java.util.ArrayList;
import Modelo.Produto;

public class ProdutoDAO {
	private ArrayList<Produto> Panfleto;

	public ProdutoDAO() {
		Panfleto = new ArrayList<Produto>();
	}

	public Boolean Inserir(Produto a) {
		Panfleto.add(a);
		return true;
	}

	public Boolean Alterar(Produto p) {
		for (Produto produto : Panfleto) {
			if (produto.getCodBarra() == p.getCodBarra()) {
				produto.setNome("Aveia");
				return true;
			}
		}
		return false;
	}

	public Boolean Excluir(Produto p) {
		for (Produto produto : Panfleto) {
			if (produto.getCodBarra() == p.getCodBarra()) {
				Panfleto.remove(produto);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Produto> listar() {
		return this.Panfleto;
	}
}
