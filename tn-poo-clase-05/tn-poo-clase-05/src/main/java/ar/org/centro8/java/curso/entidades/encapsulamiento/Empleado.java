package ar.org.centro8.java.curso.entidades.encapsulamiento;

public class Empleado {
    /*
     * Modificadores de acceso o visibilidad aplicables a atributos y métodos de una clase.
     * private: Es el nivel de acceso más restringido.
     *          Es accesible solo para la clase que lo está definiendo.
     *          Se utiliza para declarar miembros que solo deben ser utilizados por la misma clase.
     * public:  Es el modificador de acceso más sencillo.
     *          Todas las clases de todos los paquetes tienen acceso a estos miembros.
     * default: Es cuando no ponemos un modificador específico.
     *          Solo se puede tener acceso desde las clases del mismo paquete.
     * protected: Solo se puede acceder desde las clases del mismo paquete y desde las clases
     *              que extiendan de la clase que lo implemente (aunque esté en otro paquete).
     */

    //atributos
    private int id;
    private String nombre;
    private String apellido;
    private String estadoCivil;
    private double sueldoBasico;

    /*
     * Modificadores de acceso o visibilidad aplicable a constructores
     * private: Significa que ninguna otra clase puede crear un objeto de esta clase.
     *          La clase, puede contener métodos públicos y estáticos que pueden construir
     *          un objeto y devolverlo.
     * public:  Cualquiera puede crear un objeto de esa clase.
     * default: Nadie fuera del mismo paquete puede constuir un objeto de la clase.
     * protected:   Solo las subclases de la clase o aquellas que se encuentren en el mismo
     *              paquete, pueden crear un objeto de esa clase.
     */

    //constructor completo
    public Empleado(int id, String nombre, String apellido, String estadoCivil, double sueldoBasico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.sueldoBasico = sueldoBasico;
    }

    //Getters y setters
    /*
     * Los getters y setters son métodos que permiten acceder y modificar los atributos privados
     * de una clase, en forma controlada. Promoviendo el principio de encapsulamiento.
     * En Java, se recomienda declarar los atributos como privados para proteger el estado interno
     * de la clase. Los getters y setters actúan como una interfaz para leer y modificar esos
     * atributos, sin exponerlos directamente.
     * Con estos métodos se puede agregar lógica adicional, validaciones, tansformaciones, etc. 
     * Por ejemplo, se podría evitar que se asigne una edad negativa.
     * Si en el futuro cambiamos la implementación interna de la clase, podemos mantener la misma
     * interfaz pública (los métodos getters y setters) sin que las clases que los usan tengan
     * que modificarse.
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil
                + ", sueldoBasico=" + sueldoBasico + "]";
    }    

}
