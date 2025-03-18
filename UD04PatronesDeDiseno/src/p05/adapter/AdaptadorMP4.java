package p05.adapter;

/**
 * Adaptador que convierte ReproductorMP4 en un Reproductor
 */
class AdaptadorMP4 implements Reproductor {
    private ReproductorMP4 reproductorMP4;

    public AdaptadorMP4(ReproductorMP4 reproductorMP4) {
        this.reproductorMP4 = reproductorMP4;
    }

    @Override
    public void reproducir(String archivo) {
        reproductorMP4.playMP4(archivo); // Convierte la llamada a la nueva interfaz
    }
}