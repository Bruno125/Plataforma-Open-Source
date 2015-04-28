import java.util.Scanner;


public class ValidarContraseña {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese su contraseña: ");
		
		String pass = scan.next();
		boolean condLongitud=pass.length()>8;
		boolean condMayusculas=false;
		boolean condDigitos=false;
		int cM=0,cD=0;
		for(int i =0;i<pass.length();i++){
			char letra=pass.charAt(i);
			if(Character.isUpperCase(letra))
				cM++;
//			try{
//				Integer.parseInt(""+letra);
//				cD++;
//			}catch(NumberFormatException ex){}
			
//			if(letra>='0' && letra<='9')
//				cD++;
			
			if(Character.isDigit(letra))
				cD++;
			
			if(cM>=2 && cD>=2){
				break;
			}
		}
		
		condMayusculas=cM>=2;
		condDigitos=cD>=2;
		
		System.out.println("Longitud mayor a 8: "+condLongitud);
		System.out.println("Al menos 2 mayusculas: "+condMayusculas);
		System.out.println("Al menos 2 digitos: "+condDigitos);
		System.out.println("Aprobada: " + (condLongitud && condMayusculas && condDigitos));
		
		scan.close();
	}
}
