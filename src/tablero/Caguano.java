package tablero;


public class Caguano extends Carro {
	
	int rango;
	String color;
	
//	public Caguano(int ocupantes, int ingreso, int coordy, int coordx, char tipoveh, int rango, String color) {
		public Caguano(int ocupantes, int ingreso,  char tipoveh, int rango, String color) {
//		super(ocupantes, ingreso, coordy, coordx, tipoveh);
		super(ocupantes, ingreso, tipoveh);
		this.rango = rango;
		this.color = color;	
		}
	
	public int getRango() {
		return rango;
	}
	
	public String getColor() {
		return color;
	}
}

