public class C extends Planeta {

	C(Sistema sis)
	{
		this.nome = "C";
		this.velocidade = 2;
		this.numeroDeOrbita = 7;
		this.numeroDeTrajetoria = 8*7;
		this.posicaoQuadrangular = 7;
		this.numeroDeVoltas = 0;
		this.horasPorInstante = 0.1f;
		this.quadrangularParaCoordenada();
		this.sis = sis;
		this.sis.reinvidicar(this);
	}
	
	public void info()
	{
		System.out.println("Sobre: C e uma linguagem de proposito geral, muito utilizada e influente.");
		System.out.println("C deu origem as linguagens C++ e C# como suas versoes orientadas objeto.");
		System.out.println("C e conhecida por sua performance e \"proximidade ao hardware\".");
		System.out.println("No entanto, isso torna o desenvolvimento em C complicado e demorado.");
	}
}
