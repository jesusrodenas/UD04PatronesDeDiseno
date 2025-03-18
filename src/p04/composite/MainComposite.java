package p04.composite;

/**
 * El patrón Composite se utiliza cuando queremos representar una jerarquía de objetos 
 * en una estructura de árbol. Este patrón permite tratar objetos individuales y grupos 
 * de objetos de manera uniforme, facilitando operaciones recursivas.
 * 
 * Ejemplo de uso: Un sistema de archivos donde hay archivos y carpetas.
 * - Los archivos son elementos individuales.
 * - Las carpetas pueden contener archivos y otras carpetas, formando una estructura de árbol.
 */
class MainComposite {
	public static void main(String[] args) {
		// Creamos archivos individuales
		Archivo archivo1 = new Archivo("documento.txt");
		Archivo archivo2 = new Archivo("imagen.png");

		// Creamos una carpeta y agregamos archivos
		Carpeta carpeta1 = new Carpeta("Mis Documentos");
		carpeta1.agregarElemento(archivo1);
		carpeta1.agregarElemento(archivo2);

		// Creamos una carpeta más grande con subcarpetas
		Carpeta carpetaPrincipal = new Carpeta("Raíz");
		carpetaPrincipal.agregarElemento(carpeta1);
		carpetaPrincipal.agregarElemento(new Archivo("notas.txt"));

		// Mostramos toda la estructura
		carpetaPrincipal.mostrar();
	}
}