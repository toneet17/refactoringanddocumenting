package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean esMayorDeEdad(int edad)
	{
		return edad >= 18;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante estudiante = new Estudiante(10,"pepe");
        
        if ( esMayorDeEdad (estudiante.edad) ) {
        	System.out.println("El estudiante " + estudiante.nombre + " es mayor de edad");
        } else {
        	System.out.println("El estudiante " + estudiante.nombre + " es menor de edad");
        }
        
    }
}
