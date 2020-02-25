package tablero;


	public class Trupalla extends Carro{	
	int armadura;
	String chofer;
	
	
	public Trupalla(int ocupantes, int ingreso, int coordy, int coordx, char tipoveh, int rango, String color, String chofer, int armadura) {
		super(ocupantes, ingreso, coordy, coordx, tipoveh);
		
		this.armadura = armadura;
		this.chofer = chofer;	
		}
	
	public int getArmadura() {
		return armadura;
	}
	
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	
	public String getChofer() {
		return chofer;
	}
	
	
}

