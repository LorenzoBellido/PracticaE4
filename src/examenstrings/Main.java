package examenstrings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palabra = "";
		
		String letra = "";
		
		int opcion = 0;
		
		Funciones.generaPalabra();
		
		Funciones.pintaPista();
		
		while(Funciones.intentos > 0 && !palabra.equalsIgnoreCase(Funciones.palabraSecreta)) {
			opcion = Funciones.menu();
			switch (opcion) {
			case 1 -> {
				System.out.println("Introduzca una letra");
				letra = sc.next();
				Funciones.compruebaLetra(letra);
				sc.nextLine();
			}
			case 2 -> {
				System.out.println("Introduzca una palabra");
				palabra = sc.next();
				Funciones.compruebaPalabra(palabra);
				
			}
			default -> Funciones.menu();
			}
			Funciones.pintaPista();
			System.out.println("Intentos restantes: " + Funciones.intentos);
		
		}
		
		if(Funciones.intentos <= 0) {
			System.out.println("GAME OVER");
		}
		if(palabra.equals(Funciones.palabraSecreta)) {
			System.out.println("Has GANADO");
		}

	}

}
