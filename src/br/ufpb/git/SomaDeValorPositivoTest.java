package br.ufpb.git;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SomaDeValorPositivoTest {

	private SomaDeValorPositiva soma;
	
	@Before
	public void iniciaTest(){
		soma = new SomaDeValorPositiva();
        assertTrue(soma.getValorX() == -1);
        assertTrue(soma.getValorY() == -1);
        
        assertFalse(soma.isPositivoX());
        assertFalse(soma.isPositivoY());
	}
	
	@Test
    public void receberUmValorEndSomaTest() {
        soma.setValorX(1);
        assertEquals(1,soma.getValorX());
        assertTrue(soma.isPositivoX());
    }
	
	@Test
	public void somaValoresPosTest(){
		soma.setValorX(10);
		soma.setValorY(10);
		soma.somaValor();
		assertTrue(soma.getSoma()== 20);
	}
}
