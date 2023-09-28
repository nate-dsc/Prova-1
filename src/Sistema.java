public class Sistema {

	//Grade e construtor:
	private boolean[][] sistema = new boolean[15][15];
	private char[][] tipos = new char[15][15];
	
	Sistema()
	{
		for(int x = 0; x < 15; x++)
		{
			for(int y = 0; y < 15; y++)
			{
				sistema[x][y] = false;
				tipos[x][y] = 'V';
			}
		}
		sistema[7][7] = true;
		tipos[7][7] = 'J';
	}
	
	//Metodos para astros interagirem com a grade:
	public boolean checar(Coord coord)
	{
		return sistema[coord.getX() - 1][coord.getY() - 1];
	}
	
	public void limpar(Coord coord)
	{
		sistema[coord.getX() - 1][coord.getY() - 1] = false;
		tipos[coord.getX() - 1][coord.getY() - 1] = 'V';
	}
	
	public boolean reinvidicar(Astro outro)
	{
		if(this.totalmentePreenchido() == false)
		{
			if(sistema[outro.coord.getX() - 1][outro.coord.getY() - 1] == false)
			{
				sistema[outro.coord.getX() - 1][outro.coord.getY() - 1] = true;
				tipos[outro.coord.getX() - 1][outro.coord.getY() - 1] = outro.tipo();
			}
			return true;
		}
		else
		{
			return false;
		}
	}

	//Metodo interno ao funcionamento da grade:
	private boolean totalmentePreenchido()
	{
		boolean flag = true;
		for(int i = 0; i < 15; i++)
		{
			for(int j = 0; j < 15; j++)
			{
				if(sistema[i][j] == false)
				{
					flag = false;
				}
			}
		}
		return flag;
	}
	
	//Metodo para passar informações da grade:
	public void mostrarOcupacao()
	{
		System.out.println("");
		int contador = 0;
		for(int y = 14; y >= 0; y--)
		{
			for(int x = 0; x < 15; x++)
			{
				if(sistema[x][y] == true)
				{
					System.out.print(tipos[x][y] + " ");
					contador++;
				}
				else
				{
					System.out.print("+ ");
				}
			}
			System.out.println("");
		}
		System.out.println("Ocupacao: " + contador + "/215");
		System.out.println("");
	}
	
	public int qtdNorte()
	{
		int contador = 0;
		for(int y = 8; y < 15; y++)
			for(int x = 0; x < 15; x++)
			{
				if(this.sistema[x][y] && this.tipos[x][y] == 'P')
					contador++;
			}
		return contador;
	}

	public int qtdEquador()
	{
		int contador = 0;
		for(int x = 0; x < 15; x++)
		{
			if(this.sistema[x][7] && this.tipos[x][7] == 'P')
				contador++;
		}
		return contador;
	}
	
	public int qtdSul()
	{
		int contador = 0;
		for(int y = 0; y < 7; y++)
			for(int x = 0; x < 15; x++)
			{
				if(this.sistema[x][y] && this.tipos[x][y] == 'P')
					contador++;
			}
		return contador;
	}
	
	//Registros:
	private int tempoTotal = 0;
	private int tempoInserido = 0;
	private int numeroDeRodadas = 0;
	private int numeroDeBugsInseridos = 0;
	private int numeroDeDevsInseridos = 0;
	
	//Metodos para adicionar aos registros:
	public void registrarTempo(int t)
	{
		this.tempoInserido = t;
		this.tempoTotal += this.tempoInserido;
	}
	
	public void registrarRodada()
	{
		this.numeroDeRodadas++;
	}
	
	public void registrarBug()
	{
		this.numeroDeBugsInseridos++;
	}
	
	public void registrarDev()
	{
		this.numeroDeDevsInseridos++;
	}
	
	//Metodos para passar os registros:
	public int getTempoTotal()
	{
		return this.tempoTotal;
	}
	
	public int getTempoInserido()
	{
		return this.tempoInserido;
	}
	
	public int getNumeroDeRodadas()
	{
		return this.numeroDeRodadas;
	}
	
	public int getBugsInseridos()
	{
		return this.numeroDeBugsInseridos;
	}
	
	public int getDevsInseridos()
	{
		return this.numeroDeDevsInseridos;
	}
	
//	public void registrarRodada()
//	{
//		this.numeroDeRodadas++;
//	}
//	
//	public void mostrarRodadas()
//	{
//		System.out.println("O jogo durou " + this.numeroDeRodadas + " rodadas");
//	}
	
//	public void registrarBugs(int b)
//	{
//		this.numeroDeBugsInseridos += b;
//	}
	
//	public void mostrarBugsTotal()
//	{
//		System.out.println("Ao todo, foram inseridos " + this.numeroDeBugsInseridos + " bugs");
//	}
	
//	public void registrarDevs(int d)
//	{
//		this.numeroDeDevsInseridos += d;
//	}
	
//	public void mostrarDevsTotal()
//	{
//		System.out.println("Ao todo, foram inseridos " + this.numeroDeDevsInseridos + " devs");
//	}
//	
	//Organização do plano:
//	private boolean[][] sistema = new boolean[15][15];
//	private char[][] tipos = new char[15][15];
//	
//	Sistema()
//	{
//		for(int i = 0; i < 15; i++)
//		{
//			for(int j = 0; j < 15; j++)
//			{
//				sistema[i][j] = false;
//				tipos[i][j] = 'V';
//			}
//		}
//		sistema[7][7] = true;
//		tipos[7][7] = 'J';
//	}
	
//	public boolean checar(Coord coord)
//	{
//		return sistema[coord.getX() - 1][coord.getY() - 1];
//	} 
	
//	public void limpar(Coord coord)
//	{
//		sistema[coord.getX() - 1][coord.getY() - 1] = false;
//		tipos[coord.getX() - 1][coord.getY() - 1] = 'V';
//	}
	
//	public void reinvidicar(Astro outro)
//	{
//		if(sistema[outro.coord.getX() - 1][outro.coord.getY() - 1] == false)
//		{
//			sistema[outro.coord.getX() - 1][outro.coord.getY() - 1] = true;
//			tipos[outro.coord.getX() - 1][outro.coord.getY() - 1] = outro.tipo();
//		}
//	}

//	public void mostrarOcupacao()
//	{
//		int contador = 0;
//		for(int j = 14; j >= 0; j--)
//		{
//			for(int i = 0; i < 15; i++)
//			{
//				if(sistema[i][j] == true)
//				{
//					System.out.print(tipos[i][j] + " ");
//					contador++;
//				}
//				else
//				{
//					System.out.print("+ ");
//				}
//			}
//			System.out.println("");
//		}
//		System.out.println("Ocupacao: " + contador + "/215");
//	}

//	public boolean totalmentePreenchido()
//	{
//		boolean flag = true;
//		for(int i = 0; i < 15; i++)
//		{
//			for(int j = 0; j < 15; j++)
//			{
//				if(sistema[i][j] == false)
//				{
//					flag = false;
//				}
//			}
//		}
//		return flag;
//	}
	
	
}
