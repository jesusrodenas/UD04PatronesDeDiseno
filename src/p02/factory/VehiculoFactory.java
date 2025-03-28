package p02.factory;

class VehiculoFactory {
	public static Vehiculo crearVehiculo(String tipo, String marca) {
		Vehiculo vehiculo = null;
		if (tipo.equalsIgnoreCase("coche")) {
			vehiculo = new Coche(marca);
		} else if (tipo.equalsIgnoreCase("moto")) {
			vehiculo = new Moto(marca);		
		} else if (tipo.equalsIgnoreCase("patinete")) {
			vehiculo = new Patinete(marca);
		} else {
			throw new IllegalArgumentException("Tipo de vehículo desconocido: " + tipo);
		}
		return vehiculo;
	}
}
