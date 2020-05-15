/*******************************************************
* Un ejemplo de una aplicación Java sencilla.
* M. Liu 1/8/02 
* *******************************************************/

import java.io.*;
class Liu_1_5{
	public static void main(String[ ] args)
			throws IOException{
				BufferedReader teclado = new
				BufferedReader(new InputStreamReader(System.in));
				String nombre;
				System.out.println("¿Cuál es tu nombre?"); 
				nombre = teclado.readLine( ); 
				System.out.print("Hola " + nombre); 
				System.out.println(" - bienvenido a CDYP.\n");
	} // fin main
}// fin clase
