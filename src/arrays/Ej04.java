package arrays;

public class Ej04 {

	public static void main(String[] args) {
		
		int[] table = {2,4,3,1,7,9};
		
		int clave = 5;
		
		System.out.println(buscarClave(table, clave));

	}
	
	public static int buscarClave(int[] t, int clave) {
		int encontrado = 0;
		int i = 0;
		
		while(i < t.length && t[i] != clave) {
			i++;
		}
		if(i < t.length) {
		encontrado = i;	
		}else {
			encontrado = -1;
		}
		
		return encontrado;
	}

}
