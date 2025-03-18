package p06.facade;

class Inventario {
	public boolean verificarStock(String producto) {
		System.out.println("Verificando stock de: " + producto);
		return true; // Simula que siempre hay stock
	}
}