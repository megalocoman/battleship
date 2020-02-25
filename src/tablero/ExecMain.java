package tablero;

public class ExecMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] tablero= new String [15][15];
		TableroClase obj = new TableroClase();
		tablero = obj.creaTableroVacio();
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {				
				System.out.print(tablero[i][j]+",");
			}			
			System.out.println();
		
		}

	}
}