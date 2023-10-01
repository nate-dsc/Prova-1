import java.util.Scanner;

public class JavaLar {

	public static void main(String[] args) {
		
		//Declarações:
		Scanner scan = new Scanner(System.in);

		Sistema sis = new Sistema();
		
		//Opções do menu:
		int op1 = 0;
		int op2 = 0;
		
		//Loop de execução do menu:
		do
		{
			System.out.println("");
			System.out.println("\033[38;5;208m		########   ####   ##    ##   ####  \033[0m\033[48;5;208m\033[1m ####     ####   ######  \033[0m");
			System.out.println("\033[38;5;208m		   ##     ##  ##   ##  ##   ##  ## \033[0m\033[48;5;208m\033[1m  ##     ##  ##   ##  ## \033[0m");
			System.out.println("\033[38;5;208m		   ##     ##__##   ##  ##   ##__## \033[0m\033[48;5;208m\033[1m  ##     ##__##   ##__## \033[0m");
			System.out.println("\033[38;5;208m		#  ##     ##^^##    ####    ##^^## \033[0m\033[48;5;208m\033[1m  ##  #  ##^^##   ##^^#  \033[0m");
			System.out.println("\033[38;5;208m		 ###      ##  ##     ##     ##  ## \033[0m\033[48;5;208m\033[1m ######  ##  ##   ##  ## \033[0m");
			System.out.println("");
			System.out.println("Bem vindo ao sistema JavaLar!");
			System.out.println("1. Iniciar/Retornar");
			System.out.println("\u001b[41;1m2. Sair\033[0m");
			op1 = scan.nextInt();
			
			//Escolheu "1. Iniciar/Retornar":
			if(op1 == 1)
			{
				do
				{
				//Entrada de dados:
				System.out.println("\033[33;1m=== RODADA No " + (sis.getNumeroDeRodadas()+1) + " ===\033[0m");
				sis.criarBugs();
				sis.criarDevs();
				sis.pedirTempo();
				
				//Execução:
				sis.executarRodada();
				
				//Resultados:
				sis.mostrarGrade();
				sis.areaPlanetas();
				sis.mostrarAlinhamentos();
				sis.mostrarDistancias();
				sis.mostrarDadosPlanetas();
				sis.mostrarDadosAteAgora();
				
				//Registrar o fim da rodada:
				sis.registrarRodada();
				
					//Saída:
					do
					{
						System.out.println("");
						System.out.println("Retornar ao menu inicial?");
						System.out.println("    \033[42;1m1. Continuar\033[0m | \033[41;1m2. Sair\033[0m");
						op2 = scan.nextInt();
						if(op2 != 1 && op2 != 2)
						{
							System.out.println("Opcao invalida. Tente novamente.");
						}
					}while(op2 != 1 && op2 != 2);
					
				}while(op2 != 2);
				
				//Relatorio completo:
				sis.mostrarDadosFinais();
		}
			
	}while(op1 != 2);
		
	//Escolheu "2. Sair":
	scan.close();
		
	System.exit(1);

	}
}