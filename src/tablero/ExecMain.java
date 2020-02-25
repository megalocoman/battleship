package tablero;

public class ExecMain {
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String [][] tablero= new String [15][15];
//		TableroClase obj = new TableroClase();
//		tablero = obj.creaTableroVacio();
//		
//		for (int i = 0; i < tablero.length; i++) {
//			for (int j = 0; j < tablero.length; j++) {				
//				System.out.print(tablero[i][j]+",");
//			}			
//			System.out.println();
//		}
		
		Carro[] carritos= new Carro[18];
		Kromi K1 = new Kromi(5, 2002, 'K', 2001, "guanaquin");
		Kromi K2 = new Kromi(6, 2003, 'K', 2002, "guanaquin");
		Kromi K3 = new Kromi(7, 2004, 'K', 2004, "guanaquin");
		Caguano C1 = new Caguano(5, 2004, 'C', 5, "rojo");
		Caguano C2 = new Caguano(3, 2003, 'C', 3, "verde");
		Caguano C3 = new Caguano(5, 1999, 'C', 7, "azul");
		Caguano C4 = new Caguano(4, 1998, 'C', 10, "morado");
		Caguano C5 = new Caguano(3, 2010, 'C', 2, "verde");
	
		Trupalla T1 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		Trupalla T2 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		Trupalla T3 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		Trupalla T4 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		Trupalla T5 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		Trupalla T6 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		Trupalla T7 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		Trupalla T8 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		Trupalla T9 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		Trupalla T10 = new Trupalla(2, 2002, 'T', 10, "verde", "juan", 100);
		
		C5.setCoordy(1);
		C5.setCoordx(1);
		System.out.println(C5.getCoordy());
		System.out.println(C5.getCoordx());
		
		carritos[0]= K1;
		carritos[1]= K2;
		carritos[2]= K3;
		carritos[3]= C1;
		carritos[4]= C2;
		carritos[5]= C3;
		carritos[6]= C4;
		carritos[7]= C5;
		carritos[8]= T1;
		carritos[9]= T2;
		carritos[10]= T3;
		carritos[11]= T4;
		carritos[12]= T5;
		carritos[13]= T6;
		carritos[14]= T7;
		carritos[15]= T8;
		carritos[16]= T9;
		carritos[17]= T10;
		
		for( int i = 0; i <18;i++) {
			System.out.println(carritos[i].getTipoveh());
		}
	}
	
}