import java.util.*;

public class PessoaController {
	
	PessoaModel contato = new PessoaModel ();
	PessoaView view = new PessoaView ();

	public PessoaController () {

	}


	public String geraNomesAleatorio () {
		
		String pnome [] = {"Diego", "Maria", "João", "Pedro", "Gabriel", "Alexandre", "Rafaela", "Luana", "Pamela", "Susana"};
		String snome [] = {"Pedroso", "Silva", "Costa", "Souza", "Santos", "Alves", "Teixeira", "Carvalho", "Antunes", "Fagundes"};

		String nome = null;

		Random random = new Random ();

		int inomepnome = random.nextInt(pnome.length);
		int inomesnome = random.nextInt(snome.length);

		nome = pnome[inomepnome]+" "+snome[inomesnome];

		return nome;

	}


	public String geraEndAleatorio () {

		String pnome [] = {"Diego", "Maria", "João", "Pedro", "Gabriel", "Alexandre", "Rafaela", "Luana", "Pamela", "Susana"};
		String snome [] = {"Pedroso", "Silva", "Costa", "Souza", "Santos", "Alves", "Teixeira", "Carvalho", "Antunes", "Fagundes"};
		
		String endereco = null;

		Random random = new Random ();
		
		int iendpnome = random.nextInt(pnome.length);
		int iendsnome = random.nextInt(snome.length);

		endereco = "Rua "+pnome[iendpnome]+" "+snome[iendsnome];

		return endereco;

	}
	
	public int geraTelefoneAleatorio () {
		int telefone = 0;
		
		Random random = new Random ();
		
		do {
		
		telefone = random.nextInt(999999999);
		
		} while (telefone < 100000000);
				
		return telefone;
		
	}

	public void criaContatos () {
	
		contato.setNome(geraNomesAleatorio());
		contato.setEndereco(geraEndAleatorio());
		contato.setTelefone(geraTelefoneAleatorio());
		
	}


}





