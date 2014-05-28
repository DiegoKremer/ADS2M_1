package structures;

import exceptions.FullStackException;

public class pilha {
	
	protected Object vetor[];
	private int tamanho;
	
	// Adiciona elemento à pilha
	public void push () throws FullStackException {
		if (tamanho == vetor.length) { 
			throw new FullStackException(); //Caso pilha esteja cheia mostra erro.
		}
		vetor[tamanho++] = null;
	}
	
	// Remove elemento da pilha
	public void pop () {
		
		
	}
	
}


