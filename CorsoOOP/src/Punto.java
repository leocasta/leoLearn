
public class Punto {
	private int x = 0;
	private int y = 0;
	
	 //quando si usa il costruttore di default?
	
	//prima parte
	
	//costruttore
	public Punto(int x, int y) { //perchè devo mettere anche questo se ci sono
								 // già set e get??
		
		this.x = x;	//assegna a x e y di cui sto chiamando il costruttore		
		this.y = y;	// un valore x e y
			
		
	}
		
	//getter and setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//seconda parte
	
	public int localizzaQuadrante() { //perchè non passo nessun paramentro?
		if(x>0 && y>0) 
			return 1;
		else if(x>0 && y<0)
			return 2;
		else if(x<0 && y<0)
			return 3;
		else if(x<0 && y>0)
			return 4;
		else
			return 99;
		
	}

}
