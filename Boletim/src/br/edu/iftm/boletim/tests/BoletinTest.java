package br.edu.iftm.boletim.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.iftm.boletim.Boletim;
import br.edu.iftm.boletim.Prova;

public class BoletinTest {

	
	
	@Test
	public void testNomeAluno() {
		Boletim b = new Boletim();
		b.setNomeDoAluno("worfigoon");
		
		String esperado = "worfigoon";
		
		
		assertEquals(esperado,  b.getNomeDoAluno());
		
		
	}
	
	
	@Test
	public void testNomeDaDiciplina() {
		Boletim b = new Boletim();
		b.setNomeDaDisciplina(null);
		
		String esperado = "";
		
		
		assertEquals(esperado,  b.getNomeDaDisciplina());	
		
	}
	
	@Test
	public void testArrayList() {
		
		Boletim b = new Boletim();
		
		Prova p = new Prova();
		p.setNota_max(20);
		b.adicionaProva(p);
		
		Prova p1 = new Prova();
		p1.setNota_max(40);
		b.adicionaProva(p1);
		
		Prova p2 = new Prova();
		p1.setNota_max(50);
		b.adicionaProva(p2);
	   
		
		assertEquals(esperado,  b.getNomeDoAluno());
		
	}
	
	

}
