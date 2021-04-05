package es.studium.PR.Tema8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopiarContenido
{

	public static void main(String[] args)
	{
		String ficheroFuente, ficheroDestino;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indicar el nombre del primer fichero: ");
		ficheroFuente = teclado.nextLine();
		System.out.println("Indicar el nombre del segundo fichero: ");
		ficheroDestino = teclado.nextLine();
		teclado.close();
		try
		{
			//Origen de los datos
			FileReader fr = new FileReader(ficheroFuente);
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			
			// Destino de los datos
			FileWriter fw = new FileWriter(ficheroDestino);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			
			// Guardamos el contenido del ficheroFuente en el ficheroDestino
			while((s=entrada.readLine())!=null) {
				salida.println(s);
			}
			
			//Cerrar el objeto entrada
			entrada.close();
			fr.close();
			// Cerrar el objeto salida, el objeto bw y el fw
			salida.close();
			bw.close();
			fw.close();
			System.out.println("Se ha copiado el contenido del fichero");
		} catch (IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
		teclado.close();
	}

}
