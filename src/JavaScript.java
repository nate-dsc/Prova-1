public class JavaScript extends Planeta {

	JavaScript(Sistema sis)
	{
		this.nome = "JavaScript";
		this.velocidade = 2;
		this.numeroDeOrbita = 2;
		this.numeroDeTrajetoria = 8*2;
		this.posicaoQuadrangular = 2;
		this.numeroDeVoltas = 0;
		this.horasPorInstante = 10;
		this.quadrangularParaCoordenada();
		this.sis = sis;
		this.sis.reinvidicar(this);
	}
	
	public void info()
	{
		System.out.println("Sobre: JavaScript e uma linguagem de alto nivel fracamente tipada.");
		System.out.println("JavaScript e multiparadigma, apesar de ser mais comum seu uso OO.");
		System.out.println("JavaScript e um dos pilares da Internet contemporanea.");
		System.out.println("Isso pois foi criada para executar scripts no cliente (computador do usuario) de navegadores.");
	}
}
