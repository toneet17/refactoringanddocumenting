package es.cipfpbatoi.ed.refactoringanddocumenting;

public class Estudiante{
	
	int e;
	String n;
	
	
	public Estudiante(int e, String n) {
		this.e = e;
		this.n = n;
	}

	public int comparaTe( Estudiante e) {
		
		if (this.e == e.e){
			return 0;
		} else if (this.e > e.e) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
