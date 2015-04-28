import java.util.Scanner;
import clases.Auto;

public class RegistrarAuto {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.print("Ingrese color del carro: ");
		String color = scan.next();
		System.out.print("Ingrese la marca del carro: ");
		String marca= scan.next();
		System.out.print("Ingrese año de fabricación: ");
		int año = scan.nextInt();
		Auto mAuto= new Auto();
		mAuto.setColor(color);
		mAuto.setMarca(marca);
		mAuto.setAñoFabricación(año);

		System.out.println("Color: " + mAuto.getColor());
		System.out.println("Marca: " + mAuto.getMarca());
		System.out.println("Año: " + mAuto.getAñoFabricación());
		scan.close();
	}
}
