package controller;
import exceptions.FullStackException;
import structures.pilha;
import view.Visualiza;

public class Palindromo {
	
	private String palavra;
	Visualiza view = new Visualiza ();
	pilha pilha = new pilha (palavra.length());
	pilha pilha2 = new pilha (palavra.length());
	
	
	// Construtor para o elemento Palindromo
	public Palindromo (String palavra) {
		this.palavra = palavra;
	}
	
	
	// Insere a palavra recebida do usuário em uma estrutura de pilha na ordem inversa
	public void inserePalavraInvertida () {
		try {
			for (int i = palavra.length(); i > 0; i--) {
			pilha.push(palavra.charAt(i));
			}
		} catch (FullStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Insere a palavra recebida do usuário em uma estrutura de pilha
	public void inserePalavra () {
		for (int i = 0; i < palavra.length(); i++) {
			try {
				pilha2.push(palavra.charAt(i));
			} catch (FullStackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public boolean verificaPalindromo (pilha pilha, pilha pilha2) {
		
		
		return true;
	}
	

	
}
