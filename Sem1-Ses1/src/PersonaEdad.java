import java.util.Scanner;


public class PersonaEdad {

	public static final int MAYOR_EDAD=18;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa tu edad: ");
		int edad = Integer.parseInt(entrada.next());
		if(edad>=MAYOR_EDAD){
			System.out.print("Eres mayor de edad");
		}else{
			System.out.print("Eres menor de edad");
		}
		entrada.close();
	}

}
