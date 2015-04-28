import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import clase.Empleado;


public class IngresarEmpleados {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Numero de empleados: ");
		int n=scan.nextInt();
		List<Empleado> empleados= new ArrayList<Empleado>();
		Empleado objEmpleado=null;
		for(int i =0; i<n;i++){
			objEmpleado = new Empleado();
			System.out.print("Código: ");
			objEmpleado.setCodigo(scan.next());
			System.out.print("Nombre: ");
			objEmpleado.setNombre(scan.next());
			System.out.print("Sueldo: ");
			objEmpleado.setSueldo(scan.nextDouble());
			empleados.add(objEmpleado);
		}
		int c=1;
		for(Empleado emp : empleados){
			System.out.println("Empleado " + (c++));
			System.out.println("Código: " + emp.getCodigo());
			System.out.println("Nombre: " + emp.getNombre());
			System.out.println("Sueldo: " + emp.getSueldo());
		}
		
		System.out.println(empleados.contains(objEmpleado));
		
		objEmpleado= new Empleado();
		objEmpleado.setCodigo("123");
		objEmpleado.setNombre("abc");
		objEmpleado.setSueldo(1000);
		
		System.out.println(empleados.contains(objEmpleado));
		
		Iterator<Empleado> it= empleados.iterator();
		c=1;
		while(it.hasNext()){
			Empleado emp = it.next();
			System.out.println("Empleado " + (c++));
			System.out.println("Código: " + emp.getCodigo());
			System.out.println("Nombre: " + emp.getNombre());
			System.out.println("Sueldo: " + emp.getSueldo());
		}
		
	}
}
