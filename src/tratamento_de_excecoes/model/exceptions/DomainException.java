package tratamento_de_excecoes.model.exceptions;

//Domain pois será lançada por algum erro em entidade de domínio (reservation)

public class DomainException extends Exception {
	//RuntimeException - compilador não obriga a tratar
	//Exception - é obrigatório tratar	

	private static final long serialVersionUID = 1L;
	//adicionado valor padrão de versão 
	//classe extends Exception precisa ter um número de versão
	//objetos da classe podem ser convertidos em bytes
	
	public DomainException(String msg) {
		super(msg);
		
		//para permitir que possa instanciar a exceção personalizada
		//passando uma mensagem para ela 
	}

}
