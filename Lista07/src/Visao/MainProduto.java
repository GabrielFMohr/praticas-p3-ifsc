package Visao;

import Modelo.Produto;
import controle.ProdutoDAO;

public class MainProduto {

	public static void main(String[] args) {
		Produto pudim = new Produto();

		pudim.setNome("Pudim");
		pudim.setCodBarra((long) 176577);

		ProdutoDAO a = new ProdutoDAO();

		a.Inserir(pudim);
		System.out.println(pudim.getNome());
		System.out.println();

		a.Alterar(pudim);
		System.out.println(pudim.getNome());
		System.out.println();

		a.Excluir(pudim);

		System.out.println(a.listar().size());

	}

}
