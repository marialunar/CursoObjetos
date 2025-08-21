package ar.org.centro8.java.curso;

public class Auto {
    //una clase es una plantilla o molde que define los atributos y métodos que tendrán los objetos

    //atributos de la clase
    //definimos los atributos o propiedades (son variables que indican las características)
    String marca;
    String modelo;
    String color;
    int velocidad;

    //constructores
    //si no definimos un constructor, se crea uno vacío por defecto
    //el constructor se utiliza para crear un objeto de la clase
    //los métodos constructores tienen el mismo nombre que la clase y llevan paréntesis

    //constructor vacío
    Auto(){};

    //constructor completo
    Auto(String marca, String modelo, String color, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }
    //cuando creamos al menos un constructor que tenga parámetros, debemos crear el constructor 
    //vacío si queremos utilizarlo.

    //sobrecarga de constructores
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }

    //más sobrecarga
    /**
     * Método constructor para autos de la marca Ford
     * @param modelo
     * @param color
     */
    public Auto(String modelo, String color) {
        this.marca = "Ford";
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }

    //métodos de la clase
    //definimos los métodos (son bloques de código que definen el comportamiento)
    void acelerar(){
        velocidad += 10;
    }
    //cuando un método es del tipo procedimiento, debemos colocar la palabra reservada void
    //para indicar que el método no retornará nada.

    void frenar(){
        velocidad -= 10;
    }

    //sobrecarga de métodos
    //existe cuando creamos un método que se llama igual que otro, pero que tiene distinta
    //cantidad y/o tipo de parámetros
    void acelerar(int kilometros){
        velocidad += kilometros;
    }

    /**
     * Si el turbo es true, se aumenta el doble de kilómetros ingresados.
     * @param kilometros = son los kilómetros a incrementar
     * @param turbo = si es true, aumenta el doble
     */
    void acelerar(int kilometros, boolean turbo){
        if(turbo) velocidad += kilometros*2;
        else velocidad+=kilometros;
    }

    void frenar(int kilometros){
        // velocidad -= kilometros;
        if(velocidad-kilometros<0) velocidad=0;
        else velocidad -= kilometros;
    }

    void imprimirVelocidad(){
        System.out.println(velocidad);
    }

    int obtenerVelocidad(){
        return velocidad;
    }

    @Override
    public String toString(){
        return "El auto es un " + marca + ", modelo " + modelo + 
                        ", es de color " + color + " y tiene una velocidad de " + velocidad
                        +"Kms. x hora";
    }


}
