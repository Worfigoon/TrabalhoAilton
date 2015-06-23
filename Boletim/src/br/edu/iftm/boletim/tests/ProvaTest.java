package br.edu.iftm.boletim.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.iftm.boletim.Prova;

public class ProvaTest {

	Prova p = new Prova();
	@Test
	public void testProvaValendoMaisQueCem() {
		
		
		p.setNota_max(180.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
		
	}
	
	
	@Test
	public void testProvaValendoMenosQueZero() {
		
		
		p.setNota_max(-90.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
		
	}
	
	@Test
	public void descricaoNula(){
		p.setDescricao(null);
		
		String esperado = "";
		String atual = p.getDescricao();
		
		assertEquals("", atual);
		
	}
	
	
	
	@Test
	public void test_NotaObtida(){
		p.setNota_max(30);
		p.setNota_obtida(33);
		
		double esperado = 0.0;
	    double atual = p.getNota_obtida();
		
		assertEquals(esperado, atual, 0.0);
	}
	

}
