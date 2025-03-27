package p01.constructor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConstructorAlumno {

	public static void main(String[] args) {
		System.out.println("APLICACIÓN DE AGENDA DE ALUMNOS");
		Scanner sc = new Scanner(System.in);
		
		
		List<Alumno> lAlumnos = obtenerListaEnArranque();
		
		int opcion = -1;
		do {
			System.out.println("1. Dar de alta un alumno");
			System.out.println("2. Listar alumnos");
			System.out.println("3. Salir y guardar");
			System.out.println("4. Salir y borrar datos");
			opcion = Integer.parseInt(sc.nextLine());
			tratarOpcion(opcion, lAlumnos);
		}while(opcion!=3 && opcion!=4);
		salir(lAlumnos, opcion);
		
	}
	
	public static void tratarOpcion(int opc, List<Alumno> lAlumnos) {
		if(opc==1) {
			crearNuevoAlumno(lAlumnos);
		}else {
			if(opc==2) {
				listarAlumnos(lAlumnos);
			}
		}
	}
	
	public static void crearNuevoAlumno(List<Alumno> lAlumnos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("- Introduzca los datos del nuevo alumno -");
		System.out.println("Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Primer apellido: ");
		String ape1 = sc.nextLine();
		System.out.println("Segundo apellido (intro si no tiene): ");
		String ape2 = sc.nextLine();
		
		Alumno.AlumnoBuilder alumnobuilder = 
				new Alumno.AlumnoBuilder(nombre, ape1, ("").equals(ape2)?null:ape2);
		Alumno alumno = alumnobuilder.build();
		
		lAlumnos.add(alumno);
	}
	
	public static void listarAlumnos(List<Alumno> lAlumnos) {
		System.out.println(lAlumnos);
	}
	
	public static void salir(List<Alumno> lAlumnos, int opcion) {
		if(opcion==3) {
			try (FileOutputStream fos = new FileOutputStream("agenda.obj");
					ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(lAlumnos);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Información salvada. ¡Hasta la vista!");
		}else {
			if(opcion==4) {
				File fAgenda = new File("agenda.obj");
				if(fAgenda.exists()) {
					fAgenda.delete();
				}
				System.out.println("Información BORRADA. ¡Hasta la vista!");
			}
		}

	}
	
	public static List<Alumno> obtenerListaEnArranque(){
		List<Alumno> lAlumnos = null;
		File fAgenda = new File("agenda.obj");
		if(!fAgenda.exists()) {
			lAlumnos = new ArrayList<Alumno>();
		}else {
			try (FileInputStream fis = new FileInputStream(fAgenda);
					ObjectInputStream ois = new ObjectInputStream(fis);){
				lAlumnos = (List<Alumno>) ois.readObject();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return lAlumnos; 
	}
}
