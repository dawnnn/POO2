package design_smells;

public class Vendedor implements FuncoesEquipeLoja{
	
	private String fala_vendedor;
	
	public Vendedor(){
		fala_vendedor = "Bem vindo, irei lhe apresentar nossos produtos";
	}

	@Override
	public void atendimentoCaixa() {
		//O Vendedor nao atende no caixa
		
	}

	@Override
	public void atendimentoVendedor() {
		System.out.println(fala_vendedor);
	}

	@Override
	public void atendimentoGerente() {
		//O Vendedor nao assume papel de gerente da loja
		
	}

	@Override
	public void atendimentoRecepcao() {
		//O Vendedor nao atende na recepcao
		
	}
	
	

}
