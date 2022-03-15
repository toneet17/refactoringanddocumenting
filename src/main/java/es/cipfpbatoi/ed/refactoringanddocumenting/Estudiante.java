package es.cipfpbatoi.ed.refactoringanddocumenting;

public class Estudiante implements IComparable{
	
	int edad;
	String nombre;
	private static final int MAYORIA_DE_EDAD = 18;
	
	public Estudiante(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public int compareTo( Estudiante estudiante) {
		
		if (this.edad == estudiante.edad){
			return 0;
		} else if (this.edad > estudiante.edad) {
			return 1;
		} else {
			return -1;
		}
	}
	public boolean esMayorDeEdad()
	{
		return edad >= MAYORIA_DE_EDAD;
	}
	
	
}
