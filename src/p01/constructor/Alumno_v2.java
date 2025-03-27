package p01.constructor;

import java.util.List;

public class Alumno_v2 {
	private String nombreAlumno;
	private String apellido1Alumno;
	private String apellido2Alumno;
	private List<ModuloProfesional> matricula;
	
	private Alumno_v2() {
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



	/**
	 * @return the matricula
	 */
	public List<ModuloProfesional> getMatricula() {
		return matricula;
	}



	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(List<ModuloProfesional> matricula) {
		this.matricula = matricula;
	}



	public class AlumnoBuilder {
		private String nombreAlumno;
		private String apellido1Alumno;
		private String apellido2Alumno;
		private List<ModuloProfesional> matricula;
		/**
		 * @param nombreAlumno
		 * @param apellido1Alumno
		 * @param apellido2Alumno
		 * @param matricula
		 */
		public AlumnoBuilder(String nombreAlumno, String apellido1Alumno, String apellido2Alumno,
				List<ModuloProfesional> matricula) {
			super();
			this.nombreAlumno = nombreAlumno;
			this.apellido1Alumno = apellido1Alumno;
			this.apellido2Alumno = apellido2Alumno;
			this.matricula = matricula;
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
		/**
		 * @return the matricula
		 */
		public List<ModuloProfesional> getMatricula() {
			return matricula;
		}
		/**
		 * @param matricula the matricula to set
		 */
		public void setMatricula(List<ModuloProfesional> matricula) {
			this.matricula = matricula;
		}
		
		public Alumno_v2 build() {
			Alumno_v2 alumno = new Alumno_v2();	
			alumno.nombreAlumno = this.nombreAlumno;
			alumno.apellido1Alumno = this.apellido1Alumno;
			alumno.apellido2Alumno = this.apellido2Alumno;
			alumno.matricula = this.matricula;
			
			return alumno;
		}
		
	}
}
