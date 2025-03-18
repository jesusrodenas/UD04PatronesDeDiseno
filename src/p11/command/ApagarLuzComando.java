package p11.command;

class ApagarLuzComando implements Comando {
    private Luz luz;

    public ApagarLuzComando(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.apagar();
    }
}