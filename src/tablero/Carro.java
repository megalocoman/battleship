package tablero;

public class Carro {
		
		
	public int ocupantes;
	public int ingreso;
	public int coordy;
	public int coordx;
	public char tipoveh;
	
		public Carro(int ocupantes, int ingreso, int coordy, int coordx, char tipoveh) {
		
		this.ocupantes = ocupantes;
		this.ingreso = ingreso;
		this.coordy = coordy;
		this.coordx = coordx;
		this.tipoveh = tipoveh;
	}	public int getOcupantes() {
		return ocupantes;
	}	public int getIngreso() {
		return ingreso;
	}	public int getCoordy() {
		return coordy;
	}
	
	public int getCoordx() {
		return coordx;
	}	public char getTipo() {
		return tipoveh;
	}	
}

