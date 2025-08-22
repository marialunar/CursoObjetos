package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.encapsulamiento.Empleado;
import ar.org.centro8.java.curso.entidades.encapsulamiento.Empleado2;

public class TestEncapsulamiento {
    public static void main(String[] args) {
        //cuando la clase que queremos utilizar, se encuentra en otro paquete, necesitamos importala

        //creamos un objeto de la clase Empleado
        // Empleado empleado1 = new Empleado();
        //error porque no existe el constructor vacío

        Empleado empleado1 = new Empleado(1, "Guillermo", "Tell", "Viudo", 3500000);
        System.out.println(empleado1);

        // empleado1.nombre = "Guillerma";
        // el atributo es privado, no puedo acceder directamente
        empleado1.setNombre("Guillerma");
        System.out.println(empleado1.getNombre());

        //creamos un objeto de la clase Empleado2
        Empleado2 empleado2 = new Empleado2(2, "Felipe", "Santo", "Soltero", 10000);
        System.out.println(empleado2);

        // empleado2.nombre = "Felipa"; el atributo es privado
        empleado2.setNombre("Felipa");
        System.out.println(empleado2.getNombre());

        // empleado2.setSueldoBasico(100000);
        // no existe el método setSueldoBasico (lo anulamos en la misma clase)



        



    }
}
