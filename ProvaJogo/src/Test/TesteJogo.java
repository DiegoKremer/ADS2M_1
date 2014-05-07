package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	

}
