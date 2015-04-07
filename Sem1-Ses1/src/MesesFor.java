import java.util.InputMismatchException;
import java.util.Scanner;


public class MesesFor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese un a�o: ");
		try{
			int a�o = scan.nextInt();
			
			System.out.println("A�os anteriores:");
			for(int i=10;i>0;i--){
				if(i!=1)
					System.out.print(a�o-i+ ", ");
				else
					System.out.print((a�o-i));
			}
			
			System.out.println("\nA�os posteriores:");
			for(int i=1;i<=10;i++){
				if(i!=10)
					System.out.print(a�o+i+ ", ");
				else
					System.out.print((a�o+i));
			}
			
			
		}catch(InputMismatchException ex){
			System.out.print("Valor inv�lido");
		}
		scan.close();
	}
}
