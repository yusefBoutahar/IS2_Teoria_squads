package prueba;

public class Main {

	/**
	 * Comparamos los elementos B[] y comprobamos que a[] contiene
	 * esos elementos al cuadrado
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {2,2,3};
		int [] b = {4,9,9};
		
		if(Compara(a,b)) {
			System.out.println("ARRAY VALIDO");
		} else {
			System.out.println("ARRAY NO VALIDO");
		}
		
	}
	
	
	public static boolean Compara(int [] a, int [] b) {
		
		if(a.length == 0 && b.length == 0) return true;
		boolean [] aux = new boolean[a.length];
		int contador = 0;
		for(int j = 0; j < b.length; j++) {
			for(int i = 0; i < a.length; i++) {
				if(b[j] == (a[i]*a[i])) {
					aux[i] = true;
					contador++;
					break;
				}
			}
		}
		if(contador == b.length) {
			for(int i = 0; i < aux.length; i++) {
				if(aux[i]==false) return false;
			}
			return true;
		}
		return false;
	}
}




