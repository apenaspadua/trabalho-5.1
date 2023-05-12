package com.example.trabalho04;

import java.io.Serializable;

public class ProdutoBean implements Serializable, Comparable<ProdutoBean> {
	
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nome;
	private String descricao;
	private double valor;
	private String estado;
	
	public ProdutoBean() {
		this.codigo = "";
		this.nome = "";
		this.descricao = "";
		this.valor = 0.0;
		this.estado = "";
	}
	
	public ProdutoBean(String codigo, String nome, String descricao, double valor, String estado) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.estado = estado;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int compareTo(ProdutoBean produto) {
		if (this.valor > produto.getValor()) {
			return 1;
		} else if (this.valor < produto.getValor()) {
			return -1;
		} else {
			return 0;
		}
	}
}