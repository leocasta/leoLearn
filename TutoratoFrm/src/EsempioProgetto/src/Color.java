
public class Color {
	//campi
    private String colore;
    private int intensit�;

    //costruttore di default
    public Color() {
	}
    
    //costruttori
    public Color(String colore) {
		this.colore = colore;
	}
    
    public Color(int intensit�) {
		this.intensit�=intensit�;
	}
    
    public Color(String colore, int intensit�) {
		this.colore = colore;
		this.intensit�=intensit�;
	}

	
    
    
    //get e set
    public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public int getIntensit�() {
		return intensit�;
	}

	public void setIntensit�(int intensit�) {
		this.intensit� = intensit�;
	}

	
	
	
	//toString
	@Override
	public String toString() {
		return "[colore=" + colore + ", intensit�=" + intensit� + "]";
	}
    
}
