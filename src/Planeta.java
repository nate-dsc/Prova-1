public abstract class Planeta extends Astro {

	//Variaveis de um planeta:
	protected String nome;
	protected int numeroDeOrbita;
	protected int velocidade;
	protected int numeroDeTrajetoria;
	protected int posicaoQuadrangular;
	protected int unidadesAndadas = 0;
	protected int numeroDeVoltas = 0;
	
	protected float horasPorInstante;
	protected float horasTotais = 0;
	protected float horasPassadas = 0;
	protected float diasTotais = 0;
	protected float diasPassados = 0;
	protected float velocidadeMedia = 0;
	protected float velocidadeRotacao = this.horasPorInstante/24;
	
	protected int bugsRecebidos = 0;
	protected int devsRecebidos = 0;
	
	//Metodos para chamar translacao e rotacao:
	public void translacao()
	{
		if(this.existe())
		{
			this.sis.limpar(this.coord);
			this.unidadesAndadas += this.sis.getTempoInserido()*this.velocidade;
			this.numeroDeVoltas = this.unidadesAndadas/this.numeroDeTrajetoria;
			this.posicaoQuadrangular = (this.posicaoQuadrangular + this.unidadesAndadas)%this.numeroDeTrajetoria;
			this.quadrangularParaCoordenada();
			this.atualizarVelocidadeMedia();
			this.sis.reinvidicar(this);
		}
			
	}
	
	public void rotacao()
	{
		this.diasPassados = 0;
		this.horasPassadas = 0;
		if(this.existe())
		{
			this.horasPassadas = this.sis.getTempoInserido()*this.horasPorInstante;
			this.horasTotais += this.horasPassadas;
			this.diasPassados = this.horasPassadas/24;
			this.diasTotais += this.horasPassadas/24;
		}
	}
	
	//Metodos para o funcionamento interno:
 	protected void quadrangularParaCoordenada()
	{
		//aresta de cima
		if(2*this.numeroDeOrbita > this.posicaoQuadrangular && this.posicaoQuadrangular >= 0)
		{
			this.coord.setCoord(8 + this.numeroDeOrbita - this.posicaoQuadrangular, 8 + this.numeroDeOrbita);
		}
		//aresta da esquerda
		if(4*this.numeroDeOrbita > this.posicaoQuadrangular && this.posicaoQuadrangular >= 2*this.numeroDeOrbita)
		{
			this.coord.setCoord(8 - this.numeroDeOrbita, 8 + 3*this.numeroDeOrbita - this.posicaoQuadrangular);
		}
		//aresta de baixo
		if(6*this.numeroDeOrbita > this.posicaoQuadrangular && this.posicaoQuadrangular >= 4*this.numeroDeOrbita)
		{
			this.coord.setCoord(8 - 5*this.numeroDeOrbita + this.posicaoQuadrangular, 8 - this.numeroDeOrbita);
		}
		//aresta da direita
		if(8*this.numeroDeOrbita > this.posicaoQuadrangular && this.posicaoQuadrangular >= 6*this.numeroDeOrbita)
		{
			this.coord.setCoord(8 + this.numeroDeOrbita, 8 - 7*this.numeroDeOrbita + this.posicaoQuadrangular);
		}
	}
	
 	protected void atualizarVelocidadeMedia()
	{
		if(this.sis.getTempoTotal() != 0)
			this.velocidadeMedia = ((float)this.unidadesAndadas)/((float)this.sis.getTempoTotal());
		else
			this.velocidadeMedia = 0;
	}
 	
 	//Metodos para interagir com devs e bugs:
	public void aumentarVelocidade()
	{
		this.velocidade += 1;
	}
	
	public void diminuirVelocidade()
	{
		this.velocidade -= 1;
	}
	
	public void registrarColisaoBug()
	{
		this.bugsRecebidos++;
	}
	
	public void registrarColisaoDev()
	{
		this.devsRecebidos++;
	}
	
	//Metodos para passar informações do planeta:
	public String getNome()
	{
		return this.nome;
	}
	
	public char tipo()
	{
		return 'P';
	}
	
	public void mostrarDados()
	{
		System.out.println("=== " + this.nome + " ===");
		if(this.existe()) System.out.println("Status: Em orbita");
		else System.out.println("Status: Destruido");
		System.out.println("Velocidade atual: " + this.velocidade + " unidades/instante");
		System.out.printf("Velocidade media: %.2f unidades/instante%n", this.velocidadeMedia);
		System.out.printf("Horas totais: %.1f horas (%.2f dias de 24h)%n", this.horasTotais, this.diasTotais);
		System.out.printf("Horas passadas na ultima rodada: %.1f horas (%.2f dias de 24h)%n", this.horasPassadas, this.diasPassados);
		System.out.println("");
	}

	public void relatorioCompletoPlaneta()
	{
		System.out.println("=== " + this.nome + " ===");
		if(this.existe()) System.out.println("Status: Em orbita");
		else System.out.println("Status: Destruido");
		System.out.println("Velocidade final: " + this.velocidade + " unidades/instante");
		System.out.printf("Velocidade media: %.2f unidades/instante%n", this.velocidadeMedia);
		System.out.printf("Velocidade de rotacao: %.2f dias/instante%n", this.velocidadeRotacao);
		System.out.printf("Dias totais (de 24h): %.2f dias%n", this.diasTotais);
		System.out.printf("Anos completos passados: %d anos JavaLar%n", this.numeroDeVoltas);
		System.out.println("");
		this.info();
		System.out.println("");
	}
	
	public abstract void info();
	
}
