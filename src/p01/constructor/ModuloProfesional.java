package p01.constructor;

public class ModuloProfesional {
	private String nombre;
	private String curso;
	/**
	 * @param nombre
	 * @param curso
	 */
	public ModuloProfesional(String nombre, String curso) {
		super();
		this.nombre = nombre;
		this.curso = curso;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
