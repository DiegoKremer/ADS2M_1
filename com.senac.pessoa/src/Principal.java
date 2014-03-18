
public class Principal {

	public static void main(String[] args) {
	
		PessoaController contato = new PessoaController ();
		PessoaView view = new PessoaView ();
		
		for (int i = 50; i > 0; i--) {
			
			view.exibeContato(contato.geraNomesAleatorio(), contato.geraEndAleatorio(), contato.geraTelefoneAleatorio());
			
		}
		
	}

}
