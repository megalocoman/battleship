package tablero;

public class Carro {
		
		
	public int ocupantes;
	public int ingreso;
	public int coordy;
	public int coordx;
	public char tipoveh;
	
		public Carro(int ocupantes, int ingreso, char tipoveh) {
		
		this.ocupantes = ocupantes;
		this.ingreso = ingreso;
//		this.coordy = coordy;
//		this.coordx = coordx;
		this.tipoveh = tipoveh;
		}

		public int getOcupantes() {
			return ocupantes;
		}

		public void setOcupantes(int ocupantes) {
			this.ocupantes = ocupantes;
		}

		public int getIngreso() {
			return ingreso;
		}

		public void setIngreso(int ingreso) {
			this.ingreso = ingreso;
		}

		public int getCoordy() {
			return coordy;
		}

		public void setCoordy(int coordy) {
			this.coordy = coordy;
		}

		public int getCoordx() {
			return coordx;
		}

		public void setCoordx(int coordx) {
			this.coordx = coordx;
		}

		public char getTipoveh() {
			return tipoveh;
		}

		public void setTipoveh(char tipoveh) {
			this.tipoveh = tipoveh;
		}	

}

