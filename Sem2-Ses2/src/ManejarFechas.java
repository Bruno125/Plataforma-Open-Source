import java.util.Calendar;


public class ManejarFechas {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("Fecha: " + c.getTime());
		
		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.MONTH, -2);
		System.out.println("Fecha: " + c2.getTime());
		
		Calendar c3 = Calendar.getInstance();
		c3.add(Calendar.YEAR, -1);
		System.out.print("Fecha: " + c3.getTime());
		
	}
}
