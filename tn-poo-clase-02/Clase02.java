public class Clase02 {
    public static void main(String[] args) {
        /*
         * Instituto: Centro de Formación Profesional N°8 - SMATA
         * Curso: Programación Orientada a Objetos
         * Lenguaje principal: Java
         * Cursada: Lunes, miércoles y viernes de 19 a 22.20hs.
         * Profesor: Francisco Acuña
         * Email: franciscoacuna.centro8@gmail.com
         * Repositorio: https://github.com/Francisco-Acuna/2025_2C_POO_TURNO_NOCHE
         * Softwares necesarios:
         *  - JDK 21 -> https://www.oracle.com/java/technologies/downloads/#java21
         *  - Visual Studio Code -> https://code.visualstudio.com/
         *  - MySQL y Workbench -> https://dev.mysql.com/downloads/installer/
         *  - Extensión de VSC -> Extension Pack for Java (by Microsoft)
         */

        // comentarios en línea
        
        /*
         * comentarios
         * en
         * bloque
         */

        /**
         * Comentarios
         * del tipo
         * JavaDoc
         */

        // etiquetas en los comentarios

        // TODO: indica tareas pendientes a implementar o finalizar

        // FIXME: señalan errores o problemas que deben ser corregidos

        //estas palabras no son parte del lenguaje Java como tal, sino convenciones que se usan
        //dentro de los comentarios. Muchos editores e IDEs las reconocen y resaltan automáticamente
        //para facilitar la colaboración y el seguimiento de tareas en el código.

        //instalar la extensión TODO TREE de Gruntfuggly

        //impresión por consola
        System.out.println("Hola Mundo!");
        //sout + tab -> atajo para impresión por consola
        //ctrl + shift + k -> elimina la línea

        //declaración de variable:
        int variable; //declaración de variable con tipo de dato e identificador
        variable = 10; //asignación de valor a la variable
        int variable2 = 10; //declaración y asignación de valor en línea
        int variable3=10, variable4=20, variable5=30; //declaración y asignación múltiple en línea

        /*
         * Java es un lenguaje fuertemente tipado, por lo cual se deben respetar ciertas pautas.
         * No se puede asignar otro tipo de dato como valor de una variable ya declarada.
         * No se puede cambiar el tipo de dato de una variabla ya declarada.
         * No se puede crear otra variable con el mismo nombre.
         * Una variable debe tener una única declaración.
         * Una variable puede tener innumerables valores, siempre que sean del mismo tipo de dato.
         */

        //Tipos de datos primitivos

        //byte - ocupa 1 byte y representa un número entero entre -128 y 127
        byte variableByte = 100;
        System.out.println(variableByte);

        //short - ocupa 2 bytes y representa un número entero entre -32.768 y 32.767
        short variableShort = 4023;
        System.out.println(variableShort);

        //int - ocupa 4 bytes y representa un número entero entre -2.147.483.648 y 2.147.483.647
        //es el tipo de dato numérico entero más utilizado
        int variableInt = 216161;
        System.out.println(variableInt);

        //long - ocupa 8 bytes y representa un número entero muy grande entre -2 elevado a la 63
        // y 2 elevado a la 63, menos 1
        long variableLong = 6541321653165135L; //debe llevar una L al final de la literal
        //por convención utilizamos una L mayúscula
        System.out.println(variableLong);

        //float - ocupa 4 bytes y representa un número con decimales 
        //tiene alrededor de 6-7 dígitos de precisión total
        float variableFloat = 123.23f; //debe llevar una f al final de la literal
        //los decimales se separan con punto.
        System.out.println(variableFloat);

        //double - ocupa 8 bytes y representa un número con decimales
        //tiene alrededor de 15-16 dígitos de precisión total
        double variableDouble = 123.23; //no hace falta agregar alguna letra al final de la literal

        //boolean - almacena solo 2 valores posibles (true o false)
        boolean variableBoolean = true;
        System.out.println(variableBoolean);

        //char - ocupa 2 bytes y almacena un número entero que representa un carater de la tabla unicode
        char variableChar = 65;
        System.out.println(variableChar);
        //también se puede almacenar el caracter directamente
        variableChar = 'f'; //los caracteres van encerrados entre comillas simples
        System.out.println(variableChar);

        //** String **
        //no es un tipo de dato primitivo
        //es una clase, se debe escribir con mayúscula
        //representa una cadena de caracteres
        String variableString = "Hola a todos";
        System.out.println(variableString);

        /*
         * tipos de escritura
         * camel case -> estoEsUnaFraseConCamelCase (variables y métodos)
         * pascal case -> EstoEsUnaFraseConPascalCase (clases e intefaces)
         * snake case -> esto_es_una_frase_con_snake_case (sql)
         * kebab case -> esto-es-una-frase-con-kebab-case (carpetas o proyectos)
         */

        //tipos de datos var (inferencia de tipos)
        //aparece a partir de JDK 10
        //No es un tipo de datos en sí mismo. Es una palabra clave que indica al compilador que
        //infiera el tipo de dato a partir de la primera asignación de valor
        var var1 = 100;     //int
        var var2 = 'c';     //char
        var var3 = "c";     //String
        var var4 = true;    //boolean
        var var5 = 12.23;   //double
        var var6 = 12.23f;  //float
        var var7 = 31351531L;   //long
        //este tipo de dato solo puede ser usado en variables locales
        //no puede ser usado como parámetro ni atributo de clase
        //no se puede declarar un var sin asignar un valor
        //no es un tipo de dato dinámico, no se puede reasignar la variable a otro tipo distinto.

        //concatenación de cadenas

        //operador de concatenación +
        String nombre = "Nashira";
        System.out.println("Mi nombre es " + nombre);

        //método String.format()
        //permite formatear cadenas
        int edad = 27;
        String mensaje = String.format("Mi nombre es %s y mi edad es de %d años.", nombre, edad);
        System.out.println(mensaje);
        /*
         * format() utiliza marcadores de posición:
         * %s -> cadenas de caracteres
         * %d -> números enteros
         * %f -> números con decimales
         * %n -> salto de línea
         */

        //método System.out.printf()
        //se utiliza para imprimir con formato
        System.out.printf("Mi nombre es %s y mi edad es de %d años.", nombre, edad);
        System.out.println();

        System.out.println("1");
        System.out.println("2");
        System.out.println("*****************");
        System.out.print("1");
        System.out.print("2\n"); //\n genera el salto de línea

        System.out.println("coso");

        //operadores
        //operadores aritméticos
        /*
         * +    suma
         * -    resta
         * *    multiplicación
         * /    división
         * %    módulo o resto de la división
         * Son operadores binarios porque necesitan de dos operandos.
         * Los operandos son numéricos y el resultado es numérico.
         */

        //operadores de asignación
        /*
         * =    asignación
         * +=   suma y asignación
         * -=   resta y asignación
         * *=   multiplicación y asignación
         * %=   módulo y asignación
         * Son operadores binarios.
         * Asignan el valor a una variable y se la modifican utilizando una expresión.
         */
        variableInt = 10; //asignando valor
        variableInt += 2; //vale 12 -> variableInt = variableInt + 2;
        variableInt -= 1; //vale 11 -> variableInt = variableInt - 1;
        
        //operadores incrementales y decrementales
        /*
         * ++   incrementa en 1 el valor de la variable
         * --   decrementa en 1 el valor de la variable
         * Puede utilizarse de dos formas:
         * prefijo: (++x o --x) La variable se modifica antes de que se use su valor en una expresión
         * sufijo: (x++ o x--) La variable se modifica después de que se use su valor en una expresión
         */

        //operadores relacionales
        /*
         * >    mayor
         * <    menor
         * >=   mayor o igual
         * <=   menor o igual
         * !=   distinto
         * Son operadores binarios.
         * Los operandos son numéricos y el resultado es booleano.
         */

        //operadores lógicos
        /*
         * &    AND (y lógico)
         * |    OR (o lógico)
         * !    NOT (negación)
         * Los operandos son booleanos y el resultado es booleano.
         */

        /*
         * Un operador lógico & o | evalúa ambas condiciones.
         * Con dos operadores && o || se evalúa la primera condición y si esta determina el 
         * valor de verdad, ya no evalúa las siguientes condiciones.
         */

        //Estructuras

        //condicionales

        //if
        int numero1 = 100;
        int numero2 = 20;

        if(numero1 > numero2){
            System.out.println("El número1 es mayor que el número2");
        }

        if(numero1 > numero2) System.out.println("El número1 es mayor que el número2");
        //mientras solo se ejecute una única instrucción, se puede escribir el if en línea
        //sin las llaves

        //if-else
        if (numero1 > numero2) {
            System.out.println("El número1 es mayor que el número2");
        } else {
            System.out.println("El número1 no es mayor que el número2");
        }

        //if-else también se puede hacer en línea si solo hay una única sentencia por bloque

        //if-else en cascada (if-else if-else)
        if (numero1 > numero2) {
            System.out.println("El número1 es mayor que el número2");
        } else if(numero1 < numero2){
            System.out.println("El número1 es menor que el número2");
        } else {
            System.out.println("Ambos números son iguales");
        }

        //if-else anidado
        edad = 20;
        boolean tienePasaporte = true; 
        if (tienePasaporte) {
            if (edad >= 18) {
                System.out.println("Puede viajar solo");
            } else {
                System.out.println("Debe viajar acompañado");
            }
        } else {
            System.out.println("No puede viajar.");
        }

        //operador ternario (if-else abreviado)
        //condición ? valorSiVerdadero : valorSiFalso
        String mensaje2 = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje2); 

         

    } //fin del método main
} //fin de la clase
