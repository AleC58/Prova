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
		System.out.println(f(10, 5, 7));
	}
		public static int f(int n, int l, int m){
		int z = 0;
		int somma =0;
		if(n==0)
			return 2;
		else if(n>0 && l%2==0){
			for(int i=0; i<n; i++){
				z=i+f(i,l/2,m);
			}
	    somma = l+z;
		//System.out.println(somma);
		}
		else{
			somma = l*m;
			//System.out.println(somma);
		}
		return somma;	
	} 

}
