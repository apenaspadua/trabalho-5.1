package com.example.trabalho04;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import junit.framework.TestCase;

public class AnuncioBeanTest extends TestCase {

    private ProdutoBean produto;
    private ArrayList<URL> fotosUrl;
    private AnuncioBean anuncio;

    protected void setUp() throws MalformedURLException {
        produto = new ProdutoBean("Teste", "Descrição do teste", null, 10.0, null);
        fotosUrl = new ArrayList<URL>();
        fotosUrl.add(new URL("https://www.teste.com/foto1.jpg"));
        fotosUrl.add(new URL("https://www.teste.com/foto2.jpg"));
        anuncio = new AnuncioBean(produto, fotosUrl, 0.2);
    }

    public void testGetProduto() {
        assertEquals(produto, anuncio.getProduto());
    }

    public void testSetProduto() {
        ProdutoBean novoProduto = new ProdutoBean("Teste 2", "Descrição do teste 2", null, 20.0, null);
        anuncio.setProduto(novoProduto);
        assertEquals(novoProduto, anuncio.getProduto());
    }

    public void testGetFotosUrl() {
        assertEquals(fotosUrl, anuncio.getFotosUrl());
    }

    public void testSetFotosUrl() throws MalformedURLException {
        ArrayList<URL> novasFotosUrl = new ArrayList<URL>();
        novasFotosUrl.add(new URL("https://www.teste.com/foto3.jpg"));
        novasFotosUrl.add(new URL("https://www.teste.com/foto4.jpg"));
        anuncio.setFotosUrl(novasFotosUrl);
        assertEquals(novasFotosUrl, anuncio.getFotosUrl());
    }

    public void testGetDesconto() {
        assertEquals(0.2, anuncio.getDesconto());
    }

    public void testSetDesconto() {
        anuncio.setDesconto(0.1);
        assertEquals(0.1, anuncio.getDesconto());

        anuncio.setDesconto(0.0);
        assertEquals(0.0, anuncio.getDesconto());

        anuncio.setDesconto(0.99);
        assertEquals(0.99, anuncio.getDesconto());

        try {
            anuncio.setDesconto(1.0);
            fail("Deveria ter lançado uma exceção");
        } catch (IllegalArgumentException e) {}

        try {
            anuncio.setDesconto(-0.1);
            fail("Deveria ter lançado uma exceção");
        } catch (IllegalArgumentException e) {}
    }

    public void testGetValor() {
        assertEquals(8.0, anuncio.getValor());
    }
}
