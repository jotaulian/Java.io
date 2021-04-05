package es.studium.PR.Tema8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Contar
{

	public static void main(String[] args)
	{
		int vocales = 0, conso = 0, signos = 0;
		String fichero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indicar el nombre del fichero: ");
		fichero = teclado.nextLine();
		teclado.close();
		try {
			//Origen de los datos
			FileReader fr = new FileReader(fichero);
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			while((s=entrada.readLine())!=null) {
				for (int i = 0; i < s.length(); i++) {
					
					if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
						vocales++;
					}else if(esConsonante(s.charAt(i))) {
						conso++;
					}else if(s.charAt(i)==' '||s.charAt(i)=='.'||s.charAt(i)==',') {
						signos++;
					}
				}
			}
			System.out.println("La cantidad de vocales es " + vocales + ", la cantidad de consonantes es " + conso 
					+ ", y la cantidad de signos de puntuación es igua a " + signos);
			//Cerrar el objeto entrada
			entrada.close();
			fr.close();
		} 
		catch(FileNotFoundException e)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}

	private static boolean esConsonante(char letra)
	{
		return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
	}

}
