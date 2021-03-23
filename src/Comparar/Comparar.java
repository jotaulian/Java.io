package Comparar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Comparar
{

	public static void main(String[] args)
	{
		String fichero1, fichero2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indicar el nombre del primer fichero: ");
		fichero1 = teclado.nextLine();
		System.out.println("Indicar el nombre del segundo fichero: ");
		fichero2 = teclado.nextLine();
		teclado.close();
		try {
			FileReader fr = new FileReader(fichero1);
			BufferedReader entrada = new BufferedReader(fr);
			FileReader fr2 = new FileReader(fichero2);
			BufferedReader entrada2 = new BufferedReader(fr2);
			String s, s2;
			boolean iguales = true;
			while(iguales&&(s=entrada.readLine())!=null && (s2=entrada2.readLine())!=null) {
				if(!s.equals(s2)) {
					iguales = false;
				}
			}
			if(iguales) {
				System.out.println("El contenido es el mismo");
			}else {
				System.out.println("El contenido es diferente");
			}
			//Cerrar el objeto entrada
			entrada.close();
			fr.close();
			entrada2.close();
			fr2.close();
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
	}


