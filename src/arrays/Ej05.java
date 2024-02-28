package arrays;

import java.util.Arrays;

public class Ej05 {

	public static void main(String[] args) {
		int t[] = {3,7,9,5,7,5,0};
		
		int clave = 7;
		
		System.out.println(Arrays.toString(buscarTodos(t, clave)));

	}
	
	public static int[] buscarTodos(int[] t, int clave) {
		int[] indices;
		
		int index = 0;
		
		int tamayo = 0;
		
		for(int i = 0; i < t.length; i++) {
			if(t[i] == clave) {
				tamayo++;
			}
		}
		
		indices = new int[tamayo];
		
		for(int i = 0; i < t.length; i++) {
			if(t[i]== clave) {
				indices[index] = i;
				index++;
			}
		}
		
		return indices;
	}

}
