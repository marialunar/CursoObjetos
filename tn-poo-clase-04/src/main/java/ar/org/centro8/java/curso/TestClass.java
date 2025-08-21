package ar.org.centro8.java.curso;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("** Test de la clase Auto **");

        //construimos un objeto de la clase Auto
        Auto auto1 = new Auto();
        //un objeto es una instancia de una clase, es decir, una entidad que tiene
        //características (atributos) y comportamiento (métodos)

        //damos estado al objeto (dar estado es completar el valor de los atributos)
        auto1.marca = "Fiat";
        auto1.modelo = "Fiorino";
        auto1.color = "Blanco";
        auto1.velocidad = 0;

        //mostramos los valores de los atributos
        System.out.println(auto1.marca);
        System.out.println(auto1.modelo);
        System.out.println(auto1.color);
        System.out.println(auto1.velocidad);

        //utilizamos los métodos de la clase Auto
        auto1.acelerar();
        System.out.println(auto1.velocidad);

        auto1.acelerar();
        auto1.acelerar();
        auto1.acelerar();
        System.out.println(auto1.velocidad);

        //creamos otro objeto de la clase Auto
        Auto auto2 = new Auto();

        //damos estado al objeto
        auto2.marca = "Fiat";
        auto2.modelo = "Cronos";
        auto2.color = "Azul";
        auto2.velocidad = 0;

        System.out.println("El auto es un " + auto2.marca + ", modelo " + auto2.modelo + 
                        ", es de color " + auto2.color + " y tiene una velocidad de " + auto2.velocidad
                        +"Kms. x hora");

        for (int i = 0; i < 5; i++) auto2.acelerar();

        auto2.acelerar(20);
        auto2.acelerar(15, true);
        auto2.frenar(12);
        auto2.imprimirVelocidad();
        
        //método toString()
        //el método toString() es un método heredado de la clase Object. La clase Object es la
        //la clase padre de todas las clases. Por lo tanto el método toString() está presente
        //en todas las clases. Su función es proporcionar una representación del objeto en forma
        //de cadena (String)
        System.out.println(auto2.toString());
        System.out.println(auto1.toString());

        //creamos un objeto de la clase Auto con el constructor completo
        Auto auto3 = new Auto("Citröen", "Picasso", "Gris", 0);
        System.out.println(auto3); //para llamar al método toString() se puede poner solo el nombre del objeto

        //creamos un objeto de la clase Auto con el constructor que no pide la velocidad
        Auto auto4 = new Auto("Chevrolet", "Classic", "Celeste");
        System.out.println(auto4);

        //creamos un objeto de la clase Auto con el constructor que es para los autos Ford
        Auto auto5 = new Auto("Taunus", "Rojo");
        System.out.println(auto5);

    }
}
