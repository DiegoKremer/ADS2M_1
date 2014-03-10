package com.senac.examples;
import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String name;
		
		System.out.println("Qual seu nome?");
		name = entrada.next();
		
		System.out.println("Hello, "+name+"!");
		
		entrada.close();

	}

}
