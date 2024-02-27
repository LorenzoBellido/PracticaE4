package arrays;

public class Ej01 {

	public static void main(String[] args) {
		
		int[] enteros = {1,3,5,7,9};
		int total = 0;
		
		total = suma(enteros);
		
		System.out.println(total);

	}

	public static int suma(int[] enteros) {
		int suma = 0;
		
		for(int valor : enteros) {
			suma += valor;
		}
		
		return suma;
	}
}
