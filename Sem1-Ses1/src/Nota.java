import java.util.Scanner;


public class Nota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa tu nota: ");
		String nota = scan.next().toLowerCase();

		switch(nota){
			case "ad":
				System.out.print("Perfecto!");
				break;
			case  "a":
				System.out.print("Muy bien!");
				break;
			case "b":
				System.out.print("Sigue intentando!");
				break;
			case "c":
				System.out.print("Maaaal");
				break;
			default:
				System.out.print("Nota inválida");
				break;
		}
		scan.close();
	}
}
