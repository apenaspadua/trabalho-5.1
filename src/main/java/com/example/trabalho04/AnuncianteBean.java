package com.example.trabalho04;

import java.util.ArrayList;

public class AnuncianteBean {
	
	private ArrayList<AnuncioBean> anuncios; 
	

	public AnuncianteBean() {
		anuncios = new ArrayList<AnuncioBean>();
	}
	
	public AnuncianteBean(String nome, String numeroCPF, ArrayList<AnuncioBean> anuncios) {
		this.anuncios = anuncios;
	}
	
	public void adicionarAnuncio(AnuncioBean anuncio) {
		anuncios.add(anuncio);	
	}
	
	public void removerAnuncio(int indice) {
		if (indice >= 0 && indice < anuncios.size()) {
			anuncios.remove(indice);	
		}
	}
	
	public Double calcularValorMedioAnuncios() {
		Double soma = 0.0;
		for (AnuncioBean anuncio : anuncios) {
			soma += anuncio.getValor();
		}
		return soma;
	}

	public Object getNome() {
		return null;
	}

	public Object getNumeroCPF() {
		return null;
	}

	public ArrayList<AnuncioBean> getAnuncios() {
		return null;
	}

}