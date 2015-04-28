import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class MesWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese un número del 1 al 12: ");
		try{
			int nMes=scan.nextInt();
			if(nMes<1 || nMes>12){
				System.out.print("Valor inválido");
			}else{
//				int c=1;
//				while(c<=nMes){
//					System.out.println(devolverMes(c++));
//				}
				do{
					System.out.println(devolverMes(nMes--));
				}while(nMes>0);
			}
		}catch (InputMismatchException e){
			System.out.print("Valor inválido");
		}
		scan.close();
	}
	
	
	public static String devolverMes(int nMes){
		List<String> meses = new ArrayList<String>();
		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.add("Julio");
		meses.add("Agosto");
		meses.add("Setiembre");
		meses.add("Octubre");
		meses.add("Noviembre");
		meses.add("Diciembre");
		return meses.get(nMes-1);
		
	}
	
}
