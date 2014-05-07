package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Controller.Gerencia;
import Exceptions.PosicaoLimiteException;
import Model.Caminhao;
import Model.Deserto;
import View.Visualiza;


public class TesteJogo {

	Visualiza view = new Visualiza ();
	Deserto deserto = new Deserto ();
	Caminhao caminhao = new Caminhao ();
	Gerencia gerencia = new Gerencia ();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void TestUnidadesDeserto () {
		assertTrue(deserto.posicoes().length == 9);
	}
	
	@Test
	public void TestCapacidadeCombustivelCaminhao () {
		assertTrue (caminhao.combustivelMax() == 6);
		
	}
	
	@Test
	public void TestSetGetCombustivelCaminhao () {
		caminhao.setCombustivelCaminhao(5);
		assertTrue(caminhao.getCombustivel() == 5);
	}
	
	@Test
	public void TestCaminhaoAvancar () {
		caminhao.setPosicaoCaminhao(0);
		gerencia.caminhaoAvancar();
		assertTrue((caminhao.getPosicaoCaminhao() == 1));
		
	}
	
	
	
	

}
