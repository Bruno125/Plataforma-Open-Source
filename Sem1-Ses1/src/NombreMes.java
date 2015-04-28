import java.util.InputMismatchException;
import java.util.Scanner;


public class NombreMes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese un número del 1 al 12: ");
		try{
			int nMes=scan.nextInt();
			if(nMes<1 || nMes>12){
				System.out.print("El número ingresado debe estar entre 1 y 12");
			}else{
				switch(nMes){
					case 1:
						System.out.print("Enero");
						break;
					case 2:
						System.out.print("Febrero");
						break;
					case 3:
						System.out.print("Marzo");
						break;
					case 4:
						System.out.print("Abril");
						break;
					case 5:
						System.out.print("Mayo");
						break;
					case 6:
						System.out.print("Junio");
						break;
					case 7:
						System.out.print("Julio");
						break;
					case 8:
						System.out.print("Agosto");
						break;
					case 9:
						System.out.print("Setiembre");
						break;
					case 10:
						System.out.print("Octubre");
						break;
					case 11:
						System.out.print("Noviembre");
						break;
					case 12:
						System.out.print("Diciembre");
						break;
				}
			}
			
			
		}catch(InputMismatchException ex){
			System.out.print("Sólo puedes ingresar números");
		}
		scan.close();
		
	}
}
