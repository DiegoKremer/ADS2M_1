package structures;

import exceptions.EmptyStackException;
import exceptions.FullStackException;

public class pilha {
	
	protected Object vetor[];
	private int tamanho;
	
	// Construtor do objeto
	public pilha (int tamanho) {
		this.tamanho = tamanho;
		vetor = new Object[tamanho];
	}
	
	// Adiciona elemento à pilha
	public void push (Object novoObjeto) throws FullStackException {
		if (tamanho == vetor.length) { 
			throw new FullStackException(); //Caso pilha esteja cheia mostra erro.
		}
		vetor[tamanho++] = novoObjeto;
	}
	
	// Remove elemento da pilha
	public Object pop () throws EmptyStackException {
		if (vetor.length == 0) {
			throw new EmptyStackException(); // Caso a pilha esteja vazia mostra erro.
		}
		Object novoVetor = vetor[-tamanho];
		vetor[tamanho] = null;
		return novoVetor;
	}
	
	// Mostra o último elemento da pilha
	public Object peek () throws EmptyStackException {
		if (vetor.length == 0) {
			throw new EmptyStackException();
		}
		return vetor[tamanho];
	}
	
}


