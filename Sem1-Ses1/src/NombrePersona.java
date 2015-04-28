import java.util.Scanner;


public class NombrePersona {
	public static void main(String[] args) {
		String nombre, apellido;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa tu nombre: ");
		nombre= entrada.next();
		System.out.print("Ingresa tu apellido: ");
		apellido = entrada.next();
		
		System.out.print("Tu nombre completo es " + nombre + " " + apellido);
		entrada.close();
		
	}
}
