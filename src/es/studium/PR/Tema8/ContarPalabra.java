package es.studium.PR.Tema8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ContarPalabra
{

	public static void main(String[] args)
	{
		String fichero, palabra;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el nombre del fichero:");
		fichero = teclado.nextLine();
		System.out.println("Dime la palabra que quieres contar: ");
		palabra = teclado.nextLine();
		teclado.close();
		try {
			FileReader fr = new FileReader(fichero);
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			while((s=entrada.readLine())!=null) {
				String[] palabras = s.split(" ");
				for (String item : palabras) {
					String itemSinSignos = item.replaceAll("\\p{Punct}", "");
					if(itemSinSignos.equals(palabra)) {
						contador++;
					}
				}
			}
			System.out.println("La palabra indicada aparecio " + contador + " veces.");
		} catch (Exception e) {
		}
	}

}
