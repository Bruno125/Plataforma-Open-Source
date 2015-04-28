import java.util.Scanner;


public class IngresarAutos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Número de autos: ");
		int n=scan.nextInt();
		String autos[][] = new String[n][2];
		for(int i=0;i<n;i++){
			System.out.print("Marca auto " + (i+1) + ": ");
			String marca = scan.next();
			System.out.print("Modelo auto " + (i+1) + ": ");
			String modelo = scan.next();
			autos[i][0]=marca;
			autos[i][1]=modelo;
		}
		
		for(int i=0;i<n;i++){
			StringBuilder sb = new StringBuilder();
			sb.append("Auto ").append(i+1).append(": ").append(autos[i][0]).append(" ").append(autos[i][1]);
			System.out.println(sb.toString()); 
		}
		
		
		scan.close();
		
	}
}
