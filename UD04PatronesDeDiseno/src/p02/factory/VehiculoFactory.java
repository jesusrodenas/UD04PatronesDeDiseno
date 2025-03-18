package p02.factory;

class VehiculoFactory {
	public static Vehiculo crearVehiculo(String tipo, String marca) {
		if (tipo.equalsIgnoreCase("coche")) {
			return new Coche(marca);
		} else if (tipo.equalsIgnoreCase("moto")) {
			return new Moto(marca);
		} else {
			throw new IllegalArgumentException("Tipo de vehículo desconocido: " + tipo);
		}
	}
}
