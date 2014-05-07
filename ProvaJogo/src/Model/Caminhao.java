package Model;

public class Caminhao {
	
	private int combustivel;
	private int posicao;
	
	public int combustivelMax() {
		int combustivelMax = 6;
		return combustivelMax;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivelCaminhao(int combustivel) {
		this.combustivel = combustivel;
		
	}
	
	public int getPosicaoCaminhao() {
		return posicao;
	}
	
	public void setPosicaoCaminhao(int posicao) {
		this.posicao = posicao;
	}
	
	
	
}
