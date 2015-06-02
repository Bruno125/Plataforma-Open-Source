
import java.util.Scanner;


public class SolcitarNombres {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nro de alumnos: ");
		int n=scan.nextInt();
		String[] nombres = new String[n];
		int c=0;
		while(c<n){
			System.out.print("Nombre " + (c+1) + ": ");
			String nombre = scan.next();
			nombres[c++]=nombre;
		}
		
		String[] nombres2 = new String[n+1];
		System.arraycopy(nombres, 0, nombres2, 0, n);
		nombres2[0]="nombre cambiado";
		nombres2[n]="otro nombre";
		
		System.out.println("Nombres:");
		for(String nombre : nombres){
			System.out.println(nombre);
		}
		
		scan.close();
	}
}
