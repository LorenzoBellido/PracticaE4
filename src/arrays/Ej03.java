package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ej03 {

	public static void main(String[] args) {
		
		int longitud = 10;
		
		int fin = 100;
		
		int [] pares = rellenaPares(longitud, fin);
		
		System.out.println(Arrays.toString(pares));

	}

	public static int[] rellenaPares(int longitud, int fin) {
		int[] pares = new int[longitud];
		Random rand = new Random();
		
		
		for(int i = 0; i < pares.length; i++) {
			pares[i] = rand.nextInt(2, (fin + 1));
			while(pares[i] % 2 != 0) {
				pares[i] = rand.nextInt(2, (fin+1));
			}
		}
		
		
		Arrays.sort(pares);
		return pares;
	}
}
