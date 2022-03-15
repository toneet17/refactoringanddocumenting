package es.cipfpbatoi.ed.refactoringanddocumenting;

public class Estudiante{
	
	int edad;
	String nombre;
	
	
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
	
}
