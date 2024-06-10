package com.santander.bankline.api.dto;

import com.santander.bankline.api.model.MovimentacaoTipo;


public class NovaMovimentacao {
	
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	private Integer idconta;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	public Integer getIdconta() {
		return idconta;
	}
	public void setIdconta(Integer idconta) {
		this.idconta = idconta;
	}

}
