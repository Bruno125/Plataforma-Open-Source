import java.util.Scanner;


public class Palabras {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa una palabra: ");
		String palabra1=scan.next();
		System.out.print("Ingresa otra palabra: ");
		String palabra2=scan.next();
		
		if(palabra2.length()>palabra1.length()){
			System.out.print("No cumple");
		}else{
			StringBuilder sb= new StringBuilder();
			sb.append(palabra1);
			boolean cumple=true;
			for(int i=0;i<palabra2.length();i++){
				boolean esta=false;
				for(int j=0;j<sb.length();j++){
					if(palabra2.charAt(i)==sb.charAt(j)){
						esta=true;
						//sb.deleteCharAt(j);
						break;
					}
				}
				if(!esta){
					cumple=false;
					break;
				}
			}

			
			if(cumple)
				System.out.print("Cumple");
			else
				System.out.print("No cumple");
			
		}
		
		scan.close();
		
	}

}
