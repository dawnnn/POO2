package design_smells;

public class Recepcionista implements FuncoesEquipeLoja{
	
	private String fala_recepcionista;
	
	public Recepcionista(){
		fala_recepcionista = "Bem vindo a loja, gostaria de falar com um de nossos vendedores?";
	}

	
	public void atendimentoCaixa() {
		//O Recepcionista nao possui atendimento no caixa
	}

	
	public void atendimentoVendedor() {
		//O Recepcionista nao possui atendimento em vendas
	}

	
	public void atendimentoGerente() {
		//O Recepcionista nao assume papel de gerente da loja
	}

	
	public void atendimentoRecepcao() {
		System.out.println(fala_recepcionista);
	}
}