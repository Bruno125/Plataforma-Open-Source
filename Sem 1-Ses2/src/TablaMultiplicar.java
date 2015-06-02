import java.util.InputMismatchException;
import java.util.Scanner;


public class TablaMultiplicar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Número: ");
		try{
			int num = scan.nextInt();
			System.out.println("Tabla de multiplicar:");
//			for(int i=1;i<=10;i++){
//				System.out.println(i + " x " + num + " = " + i*num);
//			}
			
//			int j=1;
//			while(j<=10){
//				System.out.println(j + " x " + num + " = " + j++*num);
//			}
			
			int k=1;
			do{
				System.out.println(k + " x " + num + " = " + k++*num);
			}while(k<=10);
			
		}catch(InputMismatchException ex){
			System.out.print("Valor inválido");
		}
		
		scan.close();
	}
}
