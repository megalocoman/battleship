package tablero;

public class TableroClase {

	// generar tablero
	
	static char [][] tablerovacio= new char [15][15];
	public char [][] tablerolleno = new char [15][15];
	public int longitud;
	public int coordenadaX;
	public int coordenadaY;
	public int aux,aux2;
	public int cantidadDeCarrosK,cantidadDeCarros,cantidadDeCarrosT;
	public String tipoDeCarro;
	public TableroClase() {
		
	}	
	
	public TableroClase(int longitud, int coordenadaX, int coordenadaY, int aux, int aux2, int cantidadDeCarrosK,
			int cantidadDeCarros, int cantidadDeCarrosT, String tipoDeCarro) {
		super();
		this.longitud = longitud;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.aux = aux;
		this.aux2 = aux2;
		this.cantidadDeCarrosK = cantidadDeCarrosK;
		this.cantidadDeCarros = cantidadDeCarros;
		this.cantidadDeCarrosT = cantidadDeCarrosT;
		this.tipoDeCarro = tipoDeCarro;
	}


	public static void   creaTableroVacio() {
		
		//ciclo para generar un tablero vacío
		for (int i = 0;  i< tablerovacio.length; i++) {
			for (int j = 0; j < tablerovacio.length; j++) {			
				 tablerovacio[i][j]='o';
				 
			}
		}
//		return tablero;
	}
	
	//generar carros random
	public int [][] crearCarros(Carro carros){
		int Y = 0;
		int X = 0;
		int largocarros = 0;
//		int [][] coorcarro = new int[largocarros][2];
		
		if (carros.getTipo()=='K') {
			X=13;
			Y=15;
			largocarros=3;
		}
		
		else if(carros.getTipo()=='C') {
			X=15;
			Y=14;
			largocarros=2;
		}
		
		else if(carros.getTipo()=='T') {
			X=15;
			Y=15;
			largocarros=1;
		}
		
	
		
		while(cantidadDeCarros<largocarros) {
			int [][] coorcarro = new int[largocarros][2];
			aux=0;
			aux2=0;			
			while ( aux==0 ) {
				coordenadaX=(int) (Math.random()*X);
				coordenadaY=(int) (Math.random()*Y);		
				if (tablerovacio[coordenadaX][coordenadaY]=='o') {
					
				}
					
					for (int j)
					
					
					
					
					
//				if (tablerovacio[coordenadaX][coordenadaY]=='o') {		
//						
//						if (aux2==2) {			
//							tablerovacio[coordenadaX][coordenadaY]=carros.getTipo();
//							tablerovacio[coordenadaX][coordenadaY+1]=carros.getTipo();
//							aux=1;
//							cantidadDeCarros+=1;			}
//					}else 
//				{
						aux=0;
					}
			
				}
			
		return;
	
	}
	
	
	//generar lista con carros y sus coordenadas
	
	// generar tablero lleno
	
	public  char [][] getTablerolleno(){
		tablerolleno= tablerovacio;
		return tablerolleno;
	}
	
}

	
	
	
	
	
	
	
	
	
	

