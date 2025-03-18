package p04.composite;

import java.util.ArrayList;
import java.util.List;

class Carpeta implements Elemento {
    private String nombre;
    private List<Elemento> elementos = new ArrayList<Elemento>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar elementos (archivos o subcarpetas)
    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    @Override
    public void mostrar() {
        System.out.println("Carpeta: " + nombre);
        for (Elemento elemento : elementos) {
            elemento.mostrar(); // Llamada recursiva
        }
    }
}