package tratamento_de_excecoes.model.exceptions;

//Domain pois ser� lan�ada por algum erro em entidade de dom�nio (reservation)

public class DomainException extends Exception {
	//RuntimeException - compilador n�o obriga a tratar
	//Exception - � obrigat�rio tratar	

	private static final long serialVersionUID = 1L;
	//adicionado valor padr�o de vers�o 
	//classe extends Exception precisa ter um n�mero de vers�o
	//objetos da classe podem ser convertidos em bytes
	
	public DomainException(String msg) {
		super(msg);
		
		//para permitir que possa instanciar a exce��o personalizada
		//passando uma mensagem para ela 
	}

}
