import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Fechas {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Dia semana: " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia mes: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Semana del año: " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Semana del mes: " + c.get(Calendar.WEEK_OF_MONTH));

		System.out.println("Dia de seman en mes: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Dia del año: " + c.get(Calendar.DAY_OF_YEAR));

		System.out.println("Mes: " + c.get(Calendar.MONTH));

		System.out.println("Fecha: " + c.get(Calendar.DATE));
		System.out.println("Milisegundo: " + c.get(Calendar.MILLISECOND));
		System.out.println("Hora: " + c.get(Calendar.HOUR));
		
		
		GregorianCalendar fecha = new GregorianCalendar(2015,05,12);
		
		Date fecha1=(new GregorianCalendar(2015,05,02)).getTime();
		Date fecha2=(new GregorianCalendar(2015,06,02)).getTime();
		
		System.out.println("Date: " + fecha1);
		System.out.println("Date: " + fecha2);
		
		Date d = new Date();
		System.out.println("Date: " + d);
		
		SimpleDateFormat df = new SimpleDateFormat("dd/M/yyyy");
		System.out.println(df.format(new Date()));
		System.out.println(df.format(fecha1));
		
		SimpleDateFormat df2= new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String fechaString = "30-03-2015 08:20:45";
		try {
			Date d2= df2.parse(fechaString);
			System.out.println(d2);
		} catch (ParseException e) {
			System.out.print("Error al parsear");
		}
		
		
	}
}
