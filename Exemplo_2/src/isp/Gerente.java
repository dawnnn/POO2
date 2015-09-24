package isp;

public class Gerente implements FuncaoGerente{

	private String fala_gerente;
	
	public Gerente(){
		fala_gerente = "Bem vindo a loja, sou o gerente, em que posso ajuda-lo?";
	}
	
	public void atendimentoGerente() {
		System.out.println(fala_gerente);
		
	}

}
