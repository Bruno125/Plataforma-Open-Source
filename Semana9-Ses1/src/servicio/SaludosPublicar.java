package servicio;

import java.util.Scanner;

import javax.xml.ws.Endpoint;

public class SaludosPublicar {
	
	static Endpoint endPoint = null;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		while(flag){
			System.out.print("Ingrese opcion: ");
			String opcion = scan.nextLine();
			if(opcion.equals("iniciar")){
				System.out.println("Iniciando...");
				SaludosImpl saludosImpl = new SaludosImpl();
				endPoint =Endpoint.publish("http://localhost:8082/ws/Saludos", saludosImpl);
			}else if(opcion.equals("detener")){
				System.out.println("Deteniendo...");
				endPoint.stop();
				flag = false;
				scan.close();
			}
		}
		
	}
}
