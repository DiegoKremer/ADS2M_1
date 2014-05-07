package Controller;

import Exceptions.PosicaoLimiteException;
import Model.Caminhao;

public class Gerencia {
	
	Caminhao caminhao = new Caminhao ();

	public void caminhaoAvancar() {
		
		if (caminhao.getPosicaoCaminhao() < 10) {
			caminhao.setPosicaoCaminhao((caminhao.getPosicaoCaminhao() + 1));
		}
		
		
	}

	
	
}
