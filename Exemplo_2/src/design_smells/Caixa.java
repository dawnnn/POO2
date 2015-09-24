package design_smells;

public class Caixa implements FuncoesEquipeLoja{
	
	private String fala_caixa;
	private String explicacao_caixa;

	
	public Caixa(){
		fala_caixa = "� d�bito ou cr�dito?";
		explicacao_caixa = "S� um minuto por gentileza, o meu POS travou de novo";
	}
	
	
	
	public void atendimentoCaixa() {
		System.out.println(fala_caixa);
		System.out.println(explicacao_caixa);
		
	}

	
	public void atendimentoVendedor() {
		//O Caixa nao faz atendimento em vendas
		
	}

	
	public void atendimentoGerente() {
		//O Caixa nao assume papel de gerente na loja
		
	}

	
	public void atendimentoRecepcao() {
		//O Caixa nao faz ate atendimento na recepcao
		
	}

}
