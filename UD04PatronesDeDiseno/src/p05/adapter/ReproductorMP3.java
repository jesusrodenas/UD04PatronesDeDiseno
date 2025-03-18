package p05.adapter;

/** 
 * Clase existente que ya funciona con nuestra interfaz.
 */
class ReproductorMP3 implements Reproductor {
    @Override
    public void reproducir(String archivo) {
        System.out.println("Reproduciendo MP3: " + archivo);
    }
}