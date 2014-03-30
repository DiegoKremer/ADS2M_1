package com.senac.gerenciar;

import com.senac.cliente.Cliente;
import com.senac.visualiza.Visualizacao;
import com.senac.conta.*;

public class Gerenciar {

	Cliente cliente = new Cliente ();
	Visualizacao visual = new Visualizacao ();
	Conta conta = new Conta ();
	
	public Gerenciar () {
		
		
		
		
	}
	
	public void cadastroConta () {
		
		cliente.setNome(visual.cadastroNome());
		cliente.setEndereco(visual.cadastroEndereco());
		cliente.setTelefone(visual.cadastroTelefone());
		conta.setSaldo(0);
		conta.setNumConta(visual.cadastroNumConta());
		conta.setNumVerificacao(visual.cadastroNumVerifica());
	}
	
	public void realizaSaque () {
		
		
		
	}
	
	
}
