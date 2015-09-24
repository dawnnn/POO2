package isp;

public class Recepcionista implements FuncaoRecepcionista{
	
	private String fala_recepcionista;
	
	public Recepcionista(){
		fala_recepcionista = "Bem vindo a loja, gostaria de falar com um de nossos vendedores?";
	}
	
	public void atendimentoRecepcao() {
		System.out.println(fala_recepcionista);
	}
}