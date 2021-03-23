package es.studium.PR.Tema8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddCadena
{

	public static void main(String[] args)
	{
		String cadena;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Indicar la cadena a guardar: ");
		cadena = teclado.nextLine();
		try
		{
			// Destino de los datos
			FileWriter fw = new FileWriter("fich1.txt", true);
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw);
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw);
			// Guardamos la primera línea
			salida.println(cadena);
			// Cerrar el objeto salida, el objeto bw y el fw
			salida.close();
			bw.close();
			fw.close();
			System.out.println("Archivo creado correctamente!");
		} catch (IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
		teclado.close();
	}

}
