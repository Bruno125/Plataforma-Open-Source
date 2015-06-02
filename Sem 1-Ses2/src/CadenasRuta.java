
public class CadenasRuta {
	public static void main(String[] args) {
		String ruta="c:/carpeta de usuario/documento.docx";
		String nombre=ruta.substring(ruta.lastIndexOf("/")+1,ruta.indexOf("."));
		String extension=ruta.substring(ruta.indexOf("."));
		String path=ruta.substring(0,ruta.lastIndexOf("/")+1);
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Extensión: " + extension);
		System.out.println("Path: " + path);
		
	}
}
