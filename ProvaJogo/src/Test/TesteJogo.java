package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Model.Caminhao;
import Model.Deserto;


public class TesteJogo {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void TestUnidadesDeserto () {
		Deserto deserto = new Deserto ();
		assertTrue(deserto.posicoes().length == 9);
	}
	
	@Test
	public void TestCapacidadeCombustivelCaminhao () {
		Caminhao caminhao = new Caminhao ();
		assertTrue (caminhao.combustivelMax() == 6);
		
	}
	
	public void TestSetGetCombustivelCaminhao () {
		Caminhao caminhao = new Caminhao (); 
		caminhao.setCombustivelCaminhao(5);
		assertTrue(caminhao.getCombustivel() == 5);
	}
	
	
	
	

}
