public class CMaisMais extends Planeta {

	CMaisMais(Sistema sis)
	{
		this.nome = "C++";
		this.velocidade = 2;
		this.numeroDeOrbita = 6;
		this.numeroDeTrajetoria = 8*6;
		this.posicaoQuadrangular = 6;
		this.numeroDeVoltas = 0;
		this.horasPorInstante = 0.5f;
		this.quadrangularParaCoordenada();
		this.sis = sis;
		this.sis.reinvidicar(this);
	}
	
	public void info()
	{
		System.out.println("Sobre: C++ e uma linguagem orientada objeto originada do C.");
		System.out.println("C++ tenta ser uma evolucao do C, por isso o \"++\".");
		System.out.println("Assim como C, C++ e conhecida por sua performance e \"proximidade ao hardware\".");
		System.out.println("Isso torna C++ ideal para desenvolvimento de OS e jogos.");
	}
}
