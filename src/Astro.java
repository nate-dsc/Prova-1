public abstract class Astro {

	//Caracteristicas comuns a planetas, bugs e devs:
	protected Coord coord = new Coord();
	protected boolean existencia = true;
	protected Sistema sis;
	
	//Metodo para destruir um astro:
	protected void destruir()
	{
		this.existencia = false;
		sis.limpar(this.coord);
	}
	
	//Metodos para passar dados dos astros:
	protected boolean existe()
	{
		return this.existencia;
	}
	
	protected abstract char tipo();
	
	//Metodos de interação entre astros:
	protected double distanciaEuclidiana(Astro outro)
	{
		double a, b;
		a = (double) (this.coord.getX() - outro.coord.getX())*(this.coord.getX() - outro.coord.getX());
		b = (double) (this.coord.getY() - outro.coord.getY())*(this.coord.getY() - outro.coord.getY());
		return (Math.sqrt(a + b));
	}
	
	protected int distanciaFischer(Astro outro)
	{
		int a, b;
		a = this.coord.getX() - outro.coord.getX();
		b = this.coord.getY() - outro.coord.getY();
		return Math.abs(a*b);
	}
	
}
