package br.com.senai.aula1907.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.aula1907.orm.Produtos;
import br.com.senai.aula1907.repository.ProdutoRepository;

@Service
public class ProdutosServicoCRUD implements ProdutosServico {
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produtos> listarProdutos() {
		return repository.findAll();
	}
	
	public void apagarProdutos(Integer id) {
		repository.deleteById(id);
	}

}
