/**
 * cursojava paquete que contiene Empleado y Persona
 */
package cursojava;

/**
 * Clase  que maneja los datos de un empleado
 * @author Jose Albaladejo Maciá
 * @version 1.0
 * @see cursojava.Persona
 * @since 15/01/2021
 */
public class Empleado extends Persona{

    private int numeroEmpleado;
    private String departamento;
    private String puesto;

    /**
     * Constructor por defecto
     */
    public Empleado(){
    }

    /**
     * Constructor
     * @param nombre Nombre del empleado
     * @param edad Edad del empleado
     * @param sexo Sexo del empleado
     * @param numeroEmpleado Número del empleado
     * @param departamento Departamento del empleado
     * @param puesto Puesto que realiza el empleado
     */
    public Empleado(String nombre, int edad, char sexo, 
                    int numeroEmpleado, String departamento, String puesto){

        super(nombre, edad, sexo);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.puesto = puesto;
        
    }

    /**
     * Devuelve el número del empleado
     * @return Número del empleado
     */
    public int getNumeroEmpleado() {

        return numeroEmpleado;
        
    }

    /**
     * Asigna un nuevo número al empleado
     * @param numeroEmpleado nuevo número del empleado
     */
    public void setNumeroEmpleado(int numeroEmpleado) {

        this.numeroEmpleado = numeroEmpleado;
        
    }


    /**
     * Devuelve el departamento
     * @return Departamento del empleado
     */
    public String getDepartamento() {

        return departamento;

    }


    /**
     * Asigna un nuevo departamento al empleado
     * @param departamento 
     */
    public void setDepartamento(String departamento) {

        this.departamento = departamento;

    }


    /**
     * Devuelve puesto del empleado
     * @return puesto del empleado
     */
    public String getPuesto() {

        return puesto;

    }


    /**
     * Asigna un nuevo puesto al empleado
     * @param puesto nuevo puesto del empleado
     */
    public void setPuesto(String puesto) {

        this.puesto = puesto;

    }

}