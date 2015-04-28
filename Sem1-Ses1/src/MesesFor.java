import java.util.InputMismatchException;
import java.util.Scanner;


public class MesesFor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese un año: ");
		try{
			int año = scan.nextInt();
			
			System.out.println("Años anteriores:");
			for(int i=10;i>0;i--){
				if(i!=1)
					System.out.print(año-i+ ", ");
				else
					System.out.print((año-i));
			}
			
			System.out.println("\nAños posteriores:");
			for(int i=1;i<=10;i++){
				if(i!=10)
					System.out.print(año+i+ ", ");
				else
					System.out.print((año+i));
			}
			
			
		}catch(InputMismatchException ex){
			System.out.print("Valor inválido");
		}
		scan.close();
	}
}
