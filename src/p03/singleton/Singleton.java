package p03.singleton;

//Clase Singleton para la configuración
class Configuracion {
	// Instancia única almacenada en una variable estática
	private static Configuracion instancia;

	// Variables de configuración (ejemplo)
	private String urlBaseDatos;

	// Constructor privado para evitar instancias externas
	private Configuracion() {
		this.urlBaseDatos = "jdbc:mysql://localhost:3306/miBaseDeDatos";
	}

	// Método público para obtener la única instancia
	public static Configuracion getInstancia() {
		if (instancia == null) { // Se crea solo si no existe
			instancia = new Configuracion();
		}
		return instancia;
	}

	// Métodos para acceder a la configuración
	public String getUrlBaseDatos() {
		return urlBaseDatos;
	}

	public void setUrlBaseDatos(String nuevaUrl) {
		this.urlBaseDatos = nuevaUrl;
	}
}
