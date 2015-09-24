package design_smells;

public class Gerente implements FuncoesEquipeLoja{

	private String fala_gerente;
	
	public Gerente(){
		fala_gerente = "Bem vindo a loja, sou o gerente, em que posso ajuda-lo?";
	}
	
	public void atendimentoCaixa() {
		//O Gerente nao possui atendimento no caixa
		
	}

	
	public void atendimentoVendedor() {
		//O Gerente nao possui atendimento em vendas
		
	}

	
	public void atendimentoGerente() {
		System.out.println(fala_gerente);
		
	}

	
	public void atendimentoRecepcao() {
		//O Gerente nao possui atendimento na recepcao
		
	}

}
