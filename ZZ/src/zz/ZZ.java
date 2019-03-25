package zz;

/**
 *
 * @author alex.cazziolato
 */
public class ZZ {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("funzione(1,50,24)="+funzione(1,50,24));
		System.out.println("prof(1,50,24)="+prof(1,50,24));
		
		System.out.println("\nfunzione(20,8,7)="+funzione(20,8,7));
		System.out.println("prof(20,8,7)="+prof(20,8,7));
		
		System.out.println("\nfunzione(3,8,9)="+funzione(3,8,9));
		System.out.println("prof(3,8,9)="+prof(3,8,9));
		
		System.out.println("\nfunzione(10,15,0)="+funzione(10,15,0));
		System.out.println("prof(10,15,0)="+prof(10,15,0));
	}
	
	/**
	 * 
	 * @param n
	 * @param l
	 * @param m 
	 */
	public static int funzione(int n, int l, int m){
		int ris = 0;
		if (n == 0)
			return 2;
		if(n > 0 && l%2 == 0){
			for(int i = 0; i <= n-1;i++)
				ris += l + funzione(i, l/2, m);
			return ris;
		}//fine if
		else
			return l*m;
	}

	public static int prof(int n, int l, int m){
		if(n == 0)
			return 2;
		if((n > 0) && ((l % 2) == 0)){
			int somma = l;
			for (int i = 0; i < n; i++) {
				somma += (i + prof(i, l/2, m));
			}
			return somma;
		}	
		return l*m;		
	}
}// fine classe
