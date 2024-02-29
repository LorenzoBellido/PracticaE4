package examenstrings;

import java.util.Random;
import java.util.Scanner;

public class Funciones {

	public static String palabras[] = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna",
			"cabeza", "brazo", "familia" };

	static final int NUM_INTENTOS = 7;

	static int intentos = NUM_INTENTOS;

	public static String palabraSecreta = "";

	public static String palabraPista = "";

	public static String noAcertadas = "";

	public static void generaPalabra() {
		Random rand = new Random();
		int aleatorio = rand.nextInt(0, palabras.length);
		palabraSecreta = palabras[aleatorio];
		palabraPista = "_".repeat(palabraSecreta.length());
	}

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1. Introducir letra");
		System.out.println("2. Introducir palabra");
		opcion = sc.nextInt();

		return opcion;
	}

	public static void compruebaLetra(String letra) {
		char compruebaLetra = letra.toLowerCase().charAt(0);
		int indice;
		char[] pistaArray = palabraPista.toCharArray();
		indice = palabraSecreta.indexOf(letra);

		if (indice >= 0) {
			for (int i = 0; i < palabraSecreta.length(); i++) {
	            if (Character.toLowerCase(palabraSecreta.charAt(i)) == letra.charAt(0)) {
	                pistaArray[i] = palabraSecreta.charAt(i); // Actualizar la pista con la letra acertada
	            }
	        }
			palabraPista = String.valueOf(pistaArray);
		}else {
			noAcertadas += compruebaLetra + ", ";
			intentos--;
		}
	}

	public static void compruebaPalabra(String palabra) {
		String compruebaPalabra = palabra;

		if (compruebaPalabra.equalsIgnoreCase(palabraSecreta)) {
			palabraPista = compruebaPalabra;
		} else {
			intentos--;
		}
	}

	public static void pintaPista() {
		System.out.println("Letras no acertadas: " + noAcertadas);
		System.out.println("Palabra Pista: " + palabraPista);
	}
}
