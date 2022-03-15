package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante estudiante = new Estudiante(18,"pepe");
        
        String texto_estudiante = "El estudiante ";
		if (estudiante.esMayorDeEdad() ) {
        	System.out.println(texto_estudiante + estudiante.nombre + " es mayor de edad");
        } else {
        	System.out.println(texto_estudiante + estudiante.nombre + " es menor de edad");
        }
        
    }
}
