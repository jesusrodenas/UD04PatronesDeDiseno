package p10.visitor;

class VisitadorConcreto implements Visitador {
	@Override
	public void visitar(Animal animal) {
		System.out.println("Visitando al animal: " + animal.getNombre());
	}

	@Override
	public void visitar(Planta planta) {
		System.out.println("Visitando a la planta: " + planta.getNombre());
	}
}