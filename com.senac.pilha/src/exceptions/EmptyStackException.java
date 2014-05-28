package exceptions;

public class EmptyStackException extends Exception {
	
	private static final long serialVersionUID = 8691968300843944646L;

	public EmptyStackException () {
		
		super ("A pilha está vazia.");
		
	}

}
