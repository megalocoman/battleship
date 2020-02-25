package tablero;


	
	public class Tablero {	
		public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String [][] tablero= new String [15][15];
		int longitud;
		int coordenadaX;
		int coordenadaY;
		int aux,aux2;
		int cantidadDeCarrosK,cantidadDeCarrosC,cantidadDeCarrosT;
		String tipoDeCarro;	
		
		//ciclo para generar un tablero vacío
		for (int i = 0;  i< tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {			
				tablero[i][j]="";
			}
		}
		
		tipoDeCarro="k";
		cantidadDeCarrosC=0;
		cantidadDeCarrosK=0;
		cantidadDeCarrosT=0;
		
		switch (tipoDeCarro) {
		
			case "k":			
				while(cantidadDeCarrosK<3) {
					aux=0;
					aux2=0;			
					while ( aux==0 ) {
						coordenadaX=(int) (Math.random()*15);
						coordenadaY=(int) (Math.random()*15);				
						if (tablero[coordenadaX][coordenadaY].equals("")) {		
							longitud=3;
							aux2=1;
							if(coordenadaX<13) {
								for (int i = coordenadaX+1; i < coordenadaX+longitud; i++) {		
									if (tablero[i][coordenadaY].equals("")) {
										aux2+=1;
									}
								}		
								if (aux2==3) {			
									tablero[coordenadaX][coordenadaY]="k";
									tablero[coordenadaX+1][coordenadaY]="k";
									tablero[coordenadaX+2][coordenadaY]="k";
									aux=1;
									cantidadDeCarrosK+=1;
									}
							}else {
								aux=0;
							}					
						}
					}
				}		
			case "c":			
				while(cantidadDeCarrosC<5) {
					aux=0;
					aux2=0;			while ( aux==0 ) {
						coordenadaX=(int) (Math.random()*15);
						coordenadaY=(int) (Math.random()*15);					
						if (tablero[coordenadaX][coordenadaY].equals("")) {		
							longitud=2;
							aux2=1;
							if(coordenadaY<14) {
								for (int i = coordenadaY+1; i < coordenadaY+longitud; i++) {	
									if (tablero[coordenadaX][i].equals("")) {
										aux2+=1;
									}
								}			if (aux2==2) {			
									tablero[coordenadaX][coordenadaY]="c";
									tablero[coordenadaX][coordenadaY+1]="c";
									aux=1;
									cantidadDeCarrosC+=1;			}
							}else {
								aux=0;
							}
						}
					}
				}	
			case "t":			
				while(cantidadDeCarrosT<10) {
					aux=0;
					aux2=0;			while ( aux==0 ) {
						coordenadaX=(int) (Math.random()*15);
						coordenadaY=(int) (Math.random()*15);		
						if (tablero[coordenadaX][coordenadaY].equals("")) {
							tablero[coordenadaX][coordenadaY]="t";
							aux=1;
							cantidadDeCarrosT+=1;
						}
					}
				}			
				break;
		}		
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {				
				System.out.print(tablero[i][j]+",");
			}			
			System.out.println();		
		}	
	}
}

