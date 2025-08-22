package ar.org.centro8.java.curso.entidades.encapsulamiento;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Lombok
//Es una librería para Java que reduce el código repetitivo, al generar automáticamente en 
//tiempo de compilación, algunas partes comunes de la clase
@Getter //genera automáticamente todos los getters
@Setter //genera automáticamente todos los setters
//si declaramos algún comportamiento especial de algún atributo dentro de la clase con getter
//o setter, ese comportamiento va a ser el priorizado.
//Tenemos la posibilidad de no incluir a algún atributo en los getters y setters
@ToString //genera el toString() de todos los atributos
@AllArgsConstructor //genera el cosntructor completo
//@NoArgsConstructor //genera el constructor vacío
//@RequiredArgsConstructor //genera un constructor que recibe como parámetro todos aquellos
//atributos que sean del tipo final o aquellos que sean marcados como @NonNull
/*
 * @Data
 * sirve para evitar tener que crear la anotación de cada funcionalidad por separado
 * ya que genera automáticamente:
 * Getters para todos los campos
 * Setters para todos los campos
 * Método toString() que incluye todos los atributos
 * Métodos equals() y hashCode() basados en todos los atributos
 * Un constructor requerido, es el que incluye a los atributos finales o NonNull
 */
public class Empleado2 {
    //atributos
    private int id;
    private String nombre;
    private String apellido;
    private String estadoCivil;
    @Getter(AccessLevel.NONE) //con esta anotattion el atributo no tendrá getter
    @Setter(AccessLevel.NONE) //con esta anotattion el atributo no tendrá setter
    private double sueldoBasico;
}
