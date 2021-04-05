package es.studium.PR.Tema8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BuscarPalabra
{

	public static void main(String[] args)
	{
		String fichero, palabra;
		boolean existe = false;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el nombre del fichero:");
		fichero = teclado.nextLine();
		System.out.println("Dime la palabra que quieres buscar: ");
		palabra = teclado.nextLine();
		teclado.close();
		try {
			FileReader fr = new FileReader(fichero);
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			while((s=entrada.readLine())!=null) {
				String[] palabras = s.split(" ");
				for (String item : palabras) {
					String result = item.replaceAll("\\p{Punct}", "");
					if(result.equals(palabra)) {
						existe = true;
					}
				}
			}
			if(existe) {
				System.out.println("La palabra indicada existe en el fichero");
			}else {
				System.out.println("Esa palabra NO existe en el fichero");
			}
		} catch (Exception e) {
		}
	}

}
