public class CSharp extends Planeta {

	CSharp(Sistema sis)
	{
		this.nome = "C#";
		this.velocidade = 2;
		this.numeroDeOrbita = 5;
		this.numeroDeTrajetoria = 8*5;
		this.posicaoQuadrangular = 5;
		this.numeroDeVoltas = 0;
		this.horasPorInstante = 4;
		this.quadrangularParaCoordenada();
		this.sis = sis;
		this.sis.reinvidicar(this);
	}
	
	public void info()
	{
		System.out.println("Sobre: C# foi criada pela Microsoft para ser uma linguagem OO de alto nivel.");
		System.out.println("Por isso C# e muito comparada ao Java.");
		System.out.println("Apesar disso, C# e tecnicamente multiparadigma.");
		System.out.println("Mesmo sendo de alto nivel, C# permite acessar a memoria com ponteiros.");
		System.out.println("Atualmente, C# não e mais uma \"copia\" do Java e tem funcionalidades interessantes.");
	}
}
