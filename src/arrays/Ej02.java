package arrays;

public class Ej02 {

	public static void main(String[] args) {

		int [] enteros = {1,3,5,7,9};
		
		int maximo;
		
		maximo = maximo(enteros);
		
		System.out.println(maximo);

	}
	
	public static int maximo (int enteros[]) {
		int maximo = Integer.MIN_VALUE;
		
		for(int valor : enteros) {
			if(valor > maximo) {
				maximo = valor;
			}
		}
		
		return maximo;
	}

}
