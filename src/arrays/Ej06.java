package arrays;

import java.util.Arrays;

public class Ej06 {

	public static void main(String[] args) {
		int t[] = {10,1,5,8,9,2};
		
		int num = 3;
		
		System.out.println(Arrays.toString(suma(t, num)));

	}
	public static int[] suma (int t[], int numElementos){
		int sumas[] = new int [t.length-numElementos+1];
		for (int i=0; i<sumas.length; i++) {
			for (int j=i; j<i+numElementos;j++) {
				sumas[i] += t[j];
			}
		}
		return sumas;
	}
}
