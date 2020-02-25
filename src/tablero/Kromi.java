package tablero;


public class Kromi extends Carro {	
	int anofab;
	String marca;	
	
	public Kromi(int ocupantes, int ingreso, int coordy, int coordx, char tipoveh, int anofab, String marca) {
		
	super(ocupantes, ingreso, coordy, coordx, tipoveh);
	this.anofab = anofab;
	this.marca = marca;
	}	
	
		public int getAnofab() {
		return anofab;
	}	
		
		public String getMarca() {
		return marca;
	}
}

