public class RubyonRails extends Planeta {

	RubyonRails(Sistema sis)
	{
		this.nome = "Ruby on Rails";
		this.velocidade = 2;
		this.numeroDeOrbita = 3;
		this.numeroDeTrajetoria = 8*3;
		this.posicaoQuadrangular = 3;
		this.numeroDeVoltas = 0;
		this.horasPorInstante = 48;
		this.quadrangularParaCoordenada();
		this.sis = sis;
		this.sis.reinvidicar(this);
	}
}
