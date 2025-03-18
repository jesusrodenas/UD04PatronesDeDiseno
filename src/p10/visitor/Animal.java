package p10.visitor;

class Animal implements Elemento {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void aceptar(Visitador visitador) {
        visitador.visitar(this);
    }
}
