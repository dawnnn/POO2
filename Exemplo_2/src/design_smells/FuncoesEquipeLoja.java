package design_smells;

/*
 * Interface que define as funcoes da equipe de uma loja
 */

public interface FuncoesEquipeLoja {
	
	public void atendimentoCaixa(); //Atendimento do cliente pelo funcionario do caixa
	public void atendimentoVendedor(); //Atendimento do cliente pelo vendedor durante a escolha do produto
	public void atendimentoGerente(); //Atendimento do cliente pelo gerente da loja para orientacao ou solucao de algum problema
	public void atendimentoRecepcao(); //Atendimento do clieente pelo recepcionista
}
