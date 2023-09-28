import java.util.ArrayList;
import java.util.Scanner;

public class JavaLar {

	public static void main(String[] args) {
		
		//Declarações:
		
		Scanner scan = new Scanner(System.in);
		
		Sistema sis = new Sistema();
		
		ArrayList <Planeta> planetaList = new ArrayList<Planeta>();
		
		Planeta C = new C(sis);
		planetaList.add(C);
		Planeta CMaisMais = new CMaisMais(sis);
		planetaList.add(CMaisMais);
		Planeta CSharp = new CSharp(sis);
		planetaList.add(CSharp);
		Planeta PHP = new PHP(sis);
		planetaList.add(PHP);
		Planeta RubyonRails = new RubyonRails(sis);
		planetaList.add(RubyonRails);
		Planeta JavaScript = new JavaScript(sis);
		planetaList.add(JavaScript);
		Planeta Python = new Python(sis);
		planetaList.add(Python);
		
		ArrayList <Bug> bugList = new ArrayList<Bug>();
		
		ArrayList <Dev> devList = new ArrayList<Dev>();
		
//		Bug bugT1 = new Bug(sis, 7, 8);
//		Bug bugT2 = new Bug(sis, 8, 7);
//		
//		bugList.add(bugT1);
//		bugList.add(bugT2);
		
		//Loop de execução:
		
		char op = 'n';
		while(op != 's' || op != 'S')
		{
			int qtdBugs = 0;
			System.out.println("Numero de bugs: ");
			qtdBugs = scan.nextInt();
			
			for(int i = 0; i < qtdBugs; i++)
			{
				Bug bug = new Bug(sis);
				bug.coord.mostrarCoord();
				bugList.add(bug);	
			}
			
			int qtdDevs = 0;
			System.out.println("Numero de devs: ");
			qtdDevs = scan.nextInt();
			
			for(int i = 0; i < qtdDevs; i++)
			{
				Dev dev = new Dev(sis);
				dev.coord.mostrarCoord();
				devList.add(dev);
			}
			
			int tempo = 5;
			System.out.println("Tempo: ");
			tempo = scan.nextInt();
			sis.registrarTempo(tempo);
			
			sis.registrarRodada();
			
			for(Planeta p : planetaList)
			{
				p.translacao();
				p.rotacao();
				p.coord.mostrarCoord();
				System.out.println(sis.checar(p.coord));
			}
			
			for(Bug b : bugList)
			{
				for(Planeta p : planetaList)
				{
					b.checarColisao(p);
				}
			}
			
			for(Dev d : devList)
			{
				for(Planeta p : planetaList)
				{
					d.checarColisao(p);
				}
			}
			
			sis.mostrarOcupacao();
			
			System.out.println("Numero de planetas ao norte de Java: " + sis.qtdNorte());
			System.out.println("Numero de planetas no equador de Java: " + sis.qtdEquador());
			System.out.println("Numero de planetas ao sul de Java: " + sis.qtdSul());
			
			for(Planeta p : planetaList)
			{
				p.mostrarDados();
			}
			
			
			
			System.out.println("Deseja sair? S/N");
			op = scan.next().charAt(0);
			
		}
		
		scan.close();

	}
	
}