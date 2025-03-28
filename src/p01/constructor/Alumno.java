package p01.constructor;

import java.io.Serializable;
import java.util.List;

public class Alumno implements Serializable, Comparable<Alumno> {
	private String nombreAlumno;
	private String apellido1Alumno;
	private String apellido2Alumno;
	private int edad;
	
	private Alumno() {
	}
	
	
	
	/**
	 * @return the nombreAlumno
	 */
	public String getNombreAlumno() {
		return nombreAlumno;
	}



	/**
	 * @param nombreAlumno the nombreAlumno to set
	 */
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}



	/**
	 * @return the apellido1Alumno
	 */
	public String getApellido1Alumno() {
		return apellido1Alumno;
	}



	/**
	 * @param apellido1Alumno the apellido1Alumno to set
	 */
	public void setApellido1Alumno(String apellido1Alumno) {
		this.apellido1Alumno = apellido1Alumno;
	}



	/**
	 * @return the apellido2Alumno
	 */
	public String getApellido2Alumno() {
		return apellido2Alumno;
	}



	/**
	 * @param apellido2Alumno the apellido2Alumno to set
	 */
	public void setApellido2Alumno(String apellido2Alumno) {
		this.apellido2Alumno = apellido2Alumno;
	}
	
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(nombreAlumno).append("\n");
		sb.append("Primer apellido: ").append(apellido1Alumno).append("\n");
		sb.append("Segundo apellido: ").append((apellido2Alumno==null)?"":apellido2Alumno).append("\n");
		sb.append("Edad: ").append(edad).append("\n");
		sb.append("************************\n");
		return sb.toString();
	}
	
	@Override
	public int compareTo(Alumno o) {
		int resultado = 0;
		resultado = this.apellido1Alumno.compareTo(o.apellido1Alumno);
		
		// Puede no existir segundo apellido
		// Si tiene segundo apellido, irá antes que el que no tiene segundo apellido.
		if(resultado==0) {
			if(this.apellido2Alumno==null) {
				if(o.apellido2Alumno==null) {
					resultado=0;
				}else {
					resultado=-1;
				}
				
			}else{
				if(o.apellido2Alumno==null) {
					resultado=1;
				}else {
					resultado = this.apellido2Alumno.compareTo(o.apellido2Alumno);
				}
			}
		}
		
		if(resultado==0) {
			resultado = this.nombreAlumno.compareTo(o.nombreAlumno);
		}
		
		if(resultado==0) {
			resultado = this.edad - o.edad;
		}

		return resultado;
	}

	public static class AlumnoBuilder implements Serializable{
		private String nombreAlumno;
		private String apellido1Alumno;
		private String apellido2Alumno;
		private int edadAlumno;
		/**
		 * @param nombreAlumno
		 * @param apellido1Alumno
		 * @param apellido2Alumno
		 * @param matricula
		 */
		public AlumnoBuilder(String nombreAlumno, String apellido1Alumno, String apellido2Alumno, int edadAlumno) {
			super();
			this.nombreAlumno = nombreAlumno;
			this.apellido1Alumno = apellido1Alumno;
			this.apellido2Alumno = apellido2Alumno;
			this.edadAlumno = edadAlumno;
		}
		/**
		 * @return the nombreAlumno
		 */
		public String getNombreAlumno() {
			return nombreAlumno;
		}
		/**
		 * @param nombreAlumno the nombreAlumno to set
		 */
		public void setNombreAlumno(String nombreAlumno) {
			this.nombreAlumno = nombreAlumno;
		}
		/**
		 * @return the apellido1Alumno
		 */
		public String getApellido1Alumno() {
			return apellido1Alumno;
		}
		/**
		 * @param apellido1Alumno the apellido1Alumno to set
		 */
		public void setApellido1Alumno(String apellido1Alumno) {
			this.apellido1Alumno = apellido1Alumno;
		}
		/**
		 * @return the apellido2Alumno
		 */
		public String getApellido2Alumno() {
			return apellido2Alumno;
		}
		/**
		 * @param apellido2Alumno the apellido2Alumno to set
		 */
		public void setApellido2Alumno(String apellido2Alumno) {
			this.apellido2Alumno = apellido2Alumno;
		}
		
		public Alumno build() {
			Alumno alumno = new Alumno();	
			alumno.nombreAlumno = this.nombreAlumno;
			alumno.apellido1Alumno = this.apellido1Alumno;
			alumno.apellido2Alumno = this.apellido2Alumno;
			alumno.edad = this.edadAlumno;
			
			return alumno;
		}
		
	}
}
