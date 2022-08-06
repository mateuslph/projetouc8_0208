package br.com.senai.aula1907.servico;

import java.util.List;

import br.com.senai.aula1907.orm.Produtos;

public interface ProdutosServico {
	
	public List<Produtos> listarProdutos();
	
	public void apagarProdutos(Integer id);	

}
