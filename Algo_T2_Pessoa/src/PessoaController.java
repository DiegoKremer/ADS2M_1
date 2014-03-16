public class PessoaController {

	public static void main(String[] args) {
		
		String pnome [] = {"Diego", "Maria", "João", "Pedro", "Gabriel", "Alexandre", "Rafaela", "Luana", "Pamela", "Susana"};
		String snome [] = {"Pedroso", "Silva", "Costa", "Souza", "Santos", "Alves", "Teixeira", "Carvalho", "Antunes", "Fagundes"};
		
		PessoaModel pessoa = new PessoaModel ("Diego", "Rua Ipiranga");
		
		pessoa.criaNomes(pnome, snome);
		System.out.println(pessoa.getNome());
		
	}

}
