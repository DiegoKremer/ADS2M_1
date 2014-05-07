package Exceptions;

public class PosicaoLimiteException extends Exception{
	
	private static final long serialVersionUID = -1911706399341436048L;

	public PosicaoLimiteException () {
		super("Posição limite atingida.");
	}
	
}
