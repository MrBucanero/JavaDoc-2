/**
 * cursojava paquete que contiene Empleado y Persona
 */
package cursojava;

/**
 * Clase  que contiene los datos de una persona
 * @author Jose Albaladejo Maciá
 * @version 1.0
 * @see cursojava.Persona
 * @since 15/01/2021
 */
public class Persona {
    
    protected String nombre;
    protected int edad;
    protected char sexo;
    
    /**
     * Constructor por defecto
     */
    public Persona(){
        
    }
    
    /**
     * Constructor
     * @param n nombre de la persona
     * @param e edad de la persona
     * @param s sexo de la persona
     */
    public Persona(String n, int e, char s){
        nombre=n;
        edad=e;
        sexo=s;
    }
}
