package br.com.senai.aula1907.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.aula1907.orm.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Integer> {

}
