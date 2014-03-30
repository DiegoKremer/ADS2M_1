package com.senac.visualiza;
import java.util.*;


public class Visualizacao {

	Scanner entrada = new Scanner (System.in);
	
	public String cadastroNome () {	
			System.out.println("Digite seu nome: ");
			return entrada.next();
		}
	
	public String cadastroEndereco () {
		System.out.println("Digite o endereço: ");
		return entrada.next();
	}
	
	public int cadastroTelefone () {
		System.out.println("Digite o telefone: ");
		return entrada.nextInt();
	}
	
	public double valorSaque () {
		System.out.println("Digite o valor do saque: ");
		return entrada.nextDouble();
	}
	
	public double valorDeposito () {
		System.out.println("Digite o valor do depósito: ");
		return entrada.nextDouble();
		
	}
	
	public int cadastroNumConta () {
		System.out.println("Digite o número da conta: ");
		return entrada.nextInt();
	}
	
	public int cadastroNumVerifica () {
		System.out.println("Digite o número de verificação: ");
		return entrada.nextInt();
	}
	
	}

	

