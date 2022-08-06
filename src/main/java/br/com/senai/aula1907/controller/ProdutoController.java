package br.com.senai.aula1907.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.senai.aula1907.servico.ProdutosServico;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutosServico servico;
	
	@GetMapping(value = {"/produtos"})
	public String listarProdutos(Model modelo) {
		modelo.addAttribute("produtos", servico.listarProdutos());
		return "produtos";
	}
	
	@GetMapping(value = {"/produtos/{id}"})
	public String apagarProdutos(@PathVariable Integer id) {
		servico.apagarProdutos(id);
		return "redirect:/produtos";
	}

}
