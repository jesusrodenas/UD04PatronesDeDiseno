import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import p12.delegate.Coche;
import p12.delegate.Motor;
import p12.delegate.MotorElectrico;
import p12.delegate.MotorGasolina;

public class PruebaCollections {

	public static void main(String[] args) {
		System.out.println("Cuántos coches desea registrar?:");
		Scanner sc = new Scanner(System.in);
		int numCoches = Integer.parseInt(sc.nextLine());
		List<Motor> motores = new ArrayList<Motor>();
		
		System.out.println("Los tipos de motor posible son:");
		System.out.println("1. Eléctrico");
		System.out.println("2. Gasolina");
		System.out.println("3. Hidrógeno");
		
		for(int i=1; i<=numCoches; i++){
			Motor motorACrear = null;
			System.out.println();
			System.out.println("Indique el tipo de coche del " + i + "º coche:");
			
			// 1 indicará eléctrico, 2 gasolina
			int tipoMotor = Integer.parseInt(sc.nextLine());
			
			if (tipoMotor==1) {
				motorACrear = new MotorElectrico();
			}else {
				if (tipoMotor==2) {
					motorACrear = new MotorGasolina();
				}else {
					motorACrear = new MotorHidrogeno();
				}
				
			}
			
			motores.add(motorACrear);
		}
		
		/** 
		 * Los vehículos avanzan
		 */
		System.out.println("Los vehículos avanzando son:");
		for (Motor c : motores) {
			c.avanza();
		}
	}
}
