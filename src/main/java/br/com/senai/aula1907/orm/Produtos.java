package br.com.senai.aula1907.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private String categoria;
	private Float precoDeVenda;
	private Float precoDeCusto;
	private Float margemDeLucro;
	private String foto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Float getPrecoDeVenda() {
		return precoDeVenda;
	}
	public void setPrecoDeVenda(Float precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}
	public Float getPrecoDeCusto() {
		return precoDeCusto;
	}
	public void setPrecoDeCusto(Float precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}
	public Float getMargemDeLucro() {
		return margemDeLucro;
	}
	public void setMargemDeLucro(Float margemDeLucro) {
		this.margemDeLucro = margemDeLucro;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
		
}
