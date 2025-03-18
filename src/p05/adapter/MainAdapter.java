package p05.adapter;

/**
 * El patrón Adaptador (Adapter) permite que clases con interfaces incompatibles trabajen 
 * juntas sin modificar su código. Se usa cuando queremos integrar una clase existente con 
 * una nueva interfaz, unificando su comportamiento.
 * 
 * Supongamos que estamos desarrollando un reproductor de audio y tenemos un sistema que usa 
 * una interfaz estándar Reproductor. Sin embargo, aparece una nueva librería que reproduce 
 * archivos MP4, pero su interfaz es diferente
 * 
 * - Permite reutilizar código sin modificar clases existentes.
 * - Facilita la integración con librerías externas o sistemas legados.
 * - Unifica el comportamiento de distintas clases bajo una misma interfaz.
 */
public class MainAdapter {
	public static void main(String[] args) {
		// Usamos un reproductor MP3 normal
		Reproductor mp3 = new ReproductorMP3();
		mp3.reproducir("cancion.mp3");

		// Queremos usar un ReproductorMP4, pero no es compatible
		ReproductorMP4 mp4 = new ReproductorMP4();

		// Creamos un Adaptador para usarlo como un Reproductor
		Reproductor adaptado = new AdaptadorMP4(mp4);
		adaptado.reproducir("video.mp4");
	}
}