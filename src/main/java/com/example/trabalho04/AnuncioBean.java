package com.example.trabalho04;

import java.net.URL;
import java.util.ArrayList;

public class AnuncioBean implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    
    private ProdutoBean produto;
    private ArrayList<URL> fotosUrl;
    private Double desconto; // Fração de desconto sendo 0 (0%) e 1 (100%)
    
    public AnuncioBean (String string, double d) {
        produto = new ProdutoBean();
        fotosUrl = new ArrayList<URL>();
        desconto = 0.0;
    }
    
    public AnuncioBean(ProdutoBean produto, ArrayList<URL> fotosUrl, Double desconto) {
        this.produto = produto;
        this.fotosUrl = fotosUrl;
        setDesconto(desconto);
    }
    
    public ProdutoBean getProduto() {
        return produto;
    }
    
    public void setProduto(ProdutoBean produto) {
        this.produto = produto;
    }
    
    public ArrayList<URL> getFotosUrl() {
        return fotosUrl;
    }
    
    public void setFotosUrl(ArrayList<URL> fotosUrl) {
        this.fotosUrl = fotosUrl;
    }
    
    public Double getDesconto() {
        return desconto;
    }
    
    public void setDesconto(Double desconto) {
        if (desconto < 0 || desconto >= 1.0) {
            throw new IllegalArgumentException("O desconto deve ser um número entre 0 e 1.0.");
        }
        this.desconto = desconto;
    }

    public Double getValor() {
        return produto.getValor() * (1 - desconto);
    }
}