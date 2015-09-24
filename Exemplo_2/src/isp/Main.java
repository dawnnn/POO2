package isp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		boolean recepcionado = false;
		boolean produto_escolhido = false;

		Scanner entrada_scanner = new Scanner(System.in);
		Scanner reclamacao_gerente = new Scanner(System.in);
		int escolha_usuario;

		System.out.println("-------------LOJAS EDM-------");

		do {
			System.out.println("1- Recepcao\n2- Vendas\n3- Caixa\n4- Gerente\n5- Cair fora!");
			System.out.print("Escolha em qual setor deseja ir: ");
			escolha_usuario = entrada_scanner.nextInt();
			switch (escolha_usuario) {
			case 1:
				System.out.println("\n\n");
				new Recepcionista().atendimentoRecepcao();
				recepcionado = true;
				System.out.println("\n\n");
				break;
			case 2:
				if(recepcionado == true){
					System.out.println("\n\n");
					new Vendedor().atendimentoVendedor();
					produto_escolhido = true;
				}else{
					System.err.println("\nFale com o recepcionista antes");
				}
				System.out.println("\n\n");
				break;
			case 3:
				if(produto_escolhido == true){
					System.out.println("\n\n");
					new Caixa().atendimentoCaixa();	
				}else{
					System.err.println("Fale com o vendedor antes e escolha o seu produto");
				}
				System.out.println("\n\n");
				break;
			case 4:
				new Gerente().atendimentoGerente();
				String reclama = reclamacao_gerente.next();
				System.err.println("\n Gerente: Para de reclamar seu baitola e compra alguma coisa!");				
				
				break;
			case 5:
				for (int i = 0; i < 100; i++) {
					System.out.println();
				}
				System.out.println("-----------------JA TA FORA CARA!-------------------");
			default:
				break;
			}
		} while (escolha_usuario != 5);
		System.exit(0);
	}
}
