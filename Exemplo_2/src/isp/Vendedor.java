package isp;

public class Vendedor implements FuncaoVendedor{

	private String fala_vendedor;
	
	public Vendedor(){
		fala_vendedor = "Bem vindo, irei lhe apresentar nossos produtos";
	}
	
	public void atendimentoVendedor() {	
		System.out.println(fala_vendedor);
	}
	
	

}
