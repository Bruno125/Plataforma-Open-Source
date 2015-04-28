import java.util.Scanner;

public class MayorMenor {
	public static void main(String[] args) {
		
		int menor=Integer.MAX_VALUE,mayor=Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<11;i++){
			System.out.print("Número "+i + ": ");
			String numString= scan.next();
			if(isInteger(numString)){
				int num=Integer.parseInt(numString);
				menor=Integer.min(num, menor);
				mayor=Integer.max(num, mayor);
			}else{
				System.out.println("Sólo números, ingrese el valor nuevamente");
				i--;
			}
		}
		
		System.out.println("\nMayor: " + mayor);
		System.out.println("Menor: " + menor);
		scan.close();
	}
	
	public static boolean isInteger( String str ) {
//	    try {
//	        Integer.parseInt( input );
//	        System.out.print("Tiempo: " + (System.nanoTime()-inicio));
//	        return true;
//	    }
//	    catch( NumberFormatException e ) {
//	        System.out.print("Tiempo: " + (System.nanoTime()-inicio));
//	        return false;
//	    }
		
		if (str == null) {
			return false;
		}
		int length = str.length();
		if (length == 0) {
			return false;
		}
		int i = 0;
		if (str.charAt(0) == '-') {
			if (length == 1) {
				return false;
			}
			i = 1;
		}
		for (; i < length; i++) {
			char c = str.charAt(i);
			if (c <= '0' || c >= '9') {
				return false;
			}
		}
		return true;
	}
}
