package com.example.trabalho04;

import junit.framework.TestCase;

public class ProdutoBeanTest extends TestCase {

    public void testConstrutorPadrao() {
        ProdutoBean produto = new ProdutoBean();
        assertEquals("", produto.getCodigo());
        assertEquals("", produto.getNome());
        assertEquals("", produto.getDescricao());
        assertEquals(0.0, produto.getValor(), 0.0001);
        assertEquals("", produto.getEstado());
    }

    public void testConstrutorComParametros() {
        ProdutoBean produto = new ProdutoBean("P001", "Produto 1", "Descrição do produto 1", 100.0, "Novo");
        assertEquals("P001", produto.getCodigo());
        assertEquals("Produto 1", produto.getNome());
        assertEquals("Descrição do produto 1", produto.getDescricao());
        assertEquals(100.0, produto.getValor(), 0.0001);
        assertEquals("Novo", produto.getEstado());
    }

    public void testSetCodigo() {
        ProdutoBean produto = new ProdutoBean();
        produto.setCodigo("P002");
        assertEquals("P002", produto.getCodigo());
    }

    public void testSetNome() {
        ProdutoBean produto = new ProdutoBean();
        produto.setNome("Produto 2");
        assertEquals("Produto 2", produto.getNome());
    }

    public void testSetDescricao() {
        ProdutoBean produto = new ProdutoBean();
        produto.setDescricao("Descrição do produto 2");
        assertEquals("Descrição do produto 2", produto.getDescricao());
    }

    public void testSetValor() {
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(200.0);
        assertEquals(200.0, produto.getValor(), 0.0001);
    }

    public void testSetEstado() {
        ProdutoBean produto = new ProdutoBean();
        produto.setEstado("Usado");
        assertEquals("Usado", produto.getEstado());
    }

    public void testCompareTo() {
        ProdutoBean produto1 = new ProdutoBean("P001", "Produto 1", "Descrição do produto 1", 100.0, "Novo");
        ProdutoBean produto2 = new ProdutoBean("P002", "Produto 2", "Descrição do produto 2", 200.0, "Usado");
        assertTrue(produto1.compareTo(produto2) < 0);
        assertTrue(produto2.compareTo(produto1) > 0);
        assertTrue(produto1.compareTo(produto1) == 0);
    }
}
