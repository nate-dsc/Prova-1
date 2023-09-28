public class Dev extends Astro {

	//Construtor:
	Dev(Sistema sis)
	{
		this.sis = sis;
		this.coord.aleatoria();
		while(sis.checar(this.coord) == true)
		{
			this.coord.aleatoria();
		}
		this.sis.reinvidicar(this);
		this.sis.registrarDev();
	}
	
	//Metodo para interação com planetas:
	void checarColisao(Planeta p)
	{
		if(this.existe() && p.existe() && this.distanciaEuclidiana(p) == 0)
		{
			p.aumentarVelocidade();
			p.registrarColisaoDev();
			this.destruir();
			System.out.println("Um dev pousou no planeta " + p.nome + "!");
		}
	}
	
	//Metodo para passar o tipo ao sistema:
	public char tipo()
	{
		return 'D';
	}
	
}
