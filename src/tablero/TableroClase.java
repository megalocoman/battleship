package tablero;

public class TableroClase {

	// generar tablero
	
	public String [][] tablero= new String [15][15];
	public int longitud;
	int coordenadaX;
	int coordenadaY;
	int aux,aux2;
	int cantidadDeCarrosK,cantidadDeCarrosC,cantidadDeCarrosT;
	String tipoDeCarro;
	public TableroClase() {
		
	}	
	
	
	public String [][]  creaTableroVacio() {
		
		//ciclo para generar un tablero vacío
		for (int i = 0;  i< tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {			
				 tablero[i][j]="";
				 
			}
		}
		return tablero;
	}
	
	
	
}

	
	
	//generar carros random
	
	
	
	
	//generar lista con carros y sus coordenadas
	
	

