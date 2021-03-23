package es.studium.PR.Tema8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Asterisco
{

	public static void main(String[] args)
	{
		char caracter;
		Scanner teclado = new Scanner(System.in);
			try
			{
				// Destino de los datos
				FileWriter fw = new FileWriter("fich2.txt");
				// Buffer de escritura
				BufferedWriter bw = new BufferedWriter(fw);
				// Objeto para la escritura
				PrintWriter salida = new PrintWriter(bw);
				do {
					System.out.println("Indicar la cadena a guardar: ");
					caracter = teclado.next().charAt(0);
					if(caracter!='*') {
						salida.println(caracter);
					}
				} 
				while(caracter!='*');
				// Guardamos la primera línea
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


