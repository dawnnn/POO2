package isp;

public class Caixa implements FuncaoCaixa{
	
	private String fala_caixa;
	private String explicacao_caixa;

	
	public Caixa(){
		fala_caixa = "É débito ou crédito?";
		explicacao_caixa = "Só um minuto por gentileza, o meu POS travou de novo";
	}
	
	
	
	public void atendimentoCaixa() {
		System.out.println(fala_caixa);
		System.err.println(explicacao_caixa);
	}
}
