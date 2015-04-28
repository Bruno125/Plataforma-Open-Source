import java.util.Scanner;
import clases.Auto;

public class RegistrarAuto {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.print("Ingrese color del carro: ");
		String color = scan.next();
		System.out.print("Ingrese la marca del carro: ");
		String marca= scan.next();
		System.out.print("Ingrese a�o de fabricaci�n: ");
		int a�o = scan.nextInt();
		Auto mAuto= new Auto();
		mAuto.setColor(color);
		mAuto.setMarca(marca);
		mAuto.setA�oFabricaci�n(a�o);

		System.out.println("Color: " + mAuto.getColor());
		System.out.println("Marca: " + mAuto.getMarca());
		System.out.println("A�o: " + mAuto.getA�oFabricaci�n());
		scan.close();
	}
}
