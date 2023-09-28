import java.util.Random;

public class Coord {

	private int x;
	private int y;
	
	Coord()
	{
		this.x = 0;
		this.y = 0;
	}
	
	void setCoord(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	void setX(int x)
	{
		this.x = x;
	}
	
	void setY(int y)
	{
		this.y = y;
	}
	
	int getX()
	{
		return this.x;
	}
	
	int getY()
	{
		return this.y;
	}
	
	boolean igual(Coord outro)
	{
		if(this.x == outro.x && this.y == outro.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void aleatoria()
	{
		Random rnd = new Random();
		this.setCoord(rnd.nextInt(1, 15), rnd.nextInt(1, 15));
	}
	
	void mostrarCoord()
	{
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	
}
