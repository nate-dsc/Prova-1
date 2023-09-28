public class Bug extends Astro {

	//Construtor:
	Bug(Sistema sis)
	{
		this.sis = sis;
		this.coord.aleatoria();
		while(sis.checar(this.coord) == true)
		{
			this.coord.aleatoria();
		}
		this.sis.reinvidicar(this);
		this.sis.registrarBug();
	}
	
	Bug(Sistema sis, int x, int y)
	{
		this.sis = sis;
		this.coord.setCoord(x, y);
		this.sis.reinvidicar(this);
	}
	
	//Metodo para interação com planetas:
	public void checarColisao(Planeta p)
	{
		if(this.existe() && p.existe() && this.distanciaEuclidiana(p) == 0)
		{
				p.diminuirVelocidade();
				p.registrarColisaoBug();
				this.destruir();
				System.out.println("Um bug atingiu o planeta " + p.nome + "!");
				p.sis.reinvidicar(p);
		}
		if(p.velocidade == 0 && p.existe())
		{
			p.destruir();
			System.out.println("O planeta " + p.nome + " foi destruido!");
		}
	}
	
	//Metodo para passar o tipo ao sistema:
	public char tipo()
	{
		return 'B';
	}

}
