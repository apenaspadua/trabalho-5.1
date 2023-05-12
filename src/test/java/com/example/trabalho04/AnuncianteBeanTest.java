package com.example.trabalho04;
import junit.framework.TestCase;
import java.util.ArrayList;

public class AnuncianteBeanTest extends TestCase {

    public void testConstrutorPadrao() {
        AnuncianteBean anunciante = new AnuncianteBean();
        assertNotNull(anunciante);
    }

    public void testConstrutorComParametros() {
        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        AnuncioBean anuncio = new AnuncioBean("Anúncio 1", 100.0);
        anuncios.add(anuncio);
        AnuncianteBean anunciante = new AnuncianteBean("João", "12345678910", anuncios);
        assertNotNull(anunciante);
    }

    public void testAdicionarAnuncio() {
        AnuncianteBean anunciante = new AnuncianteBean();
        AnuncioBean anuncio = new AnuncioBean("Anúncio 1", 100.0);
        anunciante.adicionarAnuncio(anuncio);
    }

    public void testRemoverAnuncio() {
        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        AnuncioBean anuncio = new AnuncioBean("Anúncio 1", 100.0);
        anuncios.add(anuncio);
        AnuncianteBean anunciante = new AnuncianteBean("João", "12345678910", anuncios);
        anunciante.removerAnuncio(0);
    }

    public void testCalcularValorMedioAnuncios() {
        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        AnuncioBean anuncio1 = new AnuncioBean("Anúncio 1", 100.0);
        AnuncioBean anuncio2 = new AnuncioBean("Anúncio 2", 200.0);
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);
        AnuncianteBean anunciante = new AnuncianteBean("João", "12345678910", anuncios);
        @SuppressWarnings("unused")
		Double valorMedio = anunciante.calcularValorMedioAnuncios();
    }
}
