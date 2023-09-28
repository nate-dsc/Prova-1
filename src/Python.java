public class Python extends Planeta {

	Python(Sistema sis)
	{
		this.nome = "Python";
		this.velocidade = 2;
		this.numeroDeOrbita = 1;
		this.numeroDeTrajetoria = 8*1;
		this.posicaoQuadrangular = 1;
		this.numeroDeVoltas = 0;
		this.horasPorInstante = 24;
		this.quadrangularParaCoordenada();
		this.sis = sis;
		this.sis.reinvidicar(this);
	}
}
