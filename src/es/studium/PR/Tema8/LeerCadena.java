package es.studium.PR.Tema8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerCadena
{

	public static void main(String[] args)
	{
		try {
			FileReader fr = new FileReader("fich1.txt");
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			while((s=entrada.readLine())!=null) {
				System.out.println(s);
			}
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

}
