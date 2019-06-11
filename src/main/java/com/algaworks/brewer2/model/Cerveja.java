package com.algaworks.brewer2.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {

	@NotBlank(message="SKU é obrigatório")
	private String sku;
	
	@NotBlank(message="Nome é obrigatório")
	private String nome;
	
	@NotBlank(message="Descrição é obrigatório")
	@Size(max=50,message="Tamanho da descrição deve estar entre 1 e 50")
	private String descricao;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
