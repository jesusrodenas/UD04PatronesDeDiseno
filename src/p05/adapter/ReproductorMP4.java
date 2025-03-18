package p05.adapter;

/**
 * Nueva clase incompatible (no implementa Reproductor)
 */
class ReproductorMP4 {
    public void playMP4(String archivo) {
        System.out.println("Reproduciendo MP4: " + archivo);
    }
}