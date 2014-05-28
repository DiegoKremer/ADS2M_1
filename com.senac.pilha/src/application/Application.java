package application;

import view.Visualiza;
import controller.Palindromo;

public class Application {

	public static void main(String[] args) {
		
		Visualiza view = new Visualiza ();
	
		Palindromo palindromo = new Palindromo (view.recebeDados());
		
		
	}

}
