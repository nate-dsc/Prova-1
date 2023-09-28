public class PHP extends Planeta {

	PHP(Sistema sis)
	{
		this.nome = "PHP";
		this.velocidade = 2;
		this.numeroDeOrbita = 4;
		this.numeroDeTrajetoria = 8*4;
		this.posicaoQuadrangular = 4;
		this.numeroDeVoltas = 0;
		this.horasPorInstante = 60;
		this.quadrangularParaCoordenada();
		this.sis = sis;
		this.sis.reinvidicar(this);
	}
}
