public class Clase02 {
    public static void main(String[] args) {
        /*
         * Instituto: Centro de Formacion Profesional N°8 - SMATA
         * Curso: Programacion Orientada a Objetos
         * Lenguaje principal:Java
         * Cursada: Lunes, Miercoles, Viernes de 19 a 22.20hs.
         * Profesor: Francisco Acuña
         * Email: franciscoacuna.centro8@gmail.com
         * Repositorio: https://github.com/Francisco-Acuna/2025_2C_POO_TURNO_NOCHE
         * Softwares necesarios:
         * - JDK 21 -> 
         * - Visual Studio Code ->
         * - MySQL y Workbench ->
         * - Extension de VSC ->
         */

        // comentarios en linea

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
        
        // etiquetas en los coemntarios

        // TODO: indica tareas pendientes a implementar o finalizar

        // FIXME: señalan errores o problemas que deben ser corregidos

        //estas palabras no son parte del lenguaje Java como tal, sino convenciones que se usan
        //dentro de los comentarios. Muchos editores IDEs las reconocen y resaltan automaticamente
        //para facilitar la colaboracion y el seguimeinto de tareas en el codigo.

        //instalar la extension TODO TREE de Gruntfuggly

        //impresion por consola
        System.out.println("Hola Mundo");
        //sout+tab -> atajo para impresion por consola
        //ctrl+shift+k -> elimina una linea

        //declaracion de variable
        int variable;//declaracion de variable con tipo de dato e identificador
        variable = 10; //asignacion de valor a la variable
        int variable2 = 10; // decalracion y asignacion de valor en linea
        int variable3 = 10, variable4 =20, variable5 = 30; //declaracion y asignacion multiple en linea

        //sentencia es una instruccion

        /*
         * Java es un lenguaje fuertemente tipado, por lo cual se deben respetar ciertas pautas.
         * No se puede asignar otro tipo de dato como valor de una variable ya declarada.
         * No se puede cambiar el tipo de dato de una variable ya declarada.
         * No se puede crear otra variable con el mismo nombre.
         * Una variable debe tener una unica declaracion.
         * Una variable puede tener innumerables valores, siempre que sean del mismo tipo de dato.
         */

         //Tipo de de Datos primitivos

         //byte - ocupa 1 byte y representa un numero entero entre -128 y 127
         byte variableByte = 100;
         System.out.println(variableByte);

         //short - ocupa 2 bytes y representa un numero entero entre -32.768 y 32.767
         short variableShort = 4023;
         System.out.println(variableShort);

         //int - ocupa 4 bytes y representa un numero entero entre -2.147.483.648 y 2.147.483.647
         // es el tipo de dato numerico entero mas utilizado
         int variableInt = 216161;
         System.out.println(variableInt);

         //long - ocupa 8 bytes y representa un numero entero muy grande entre -2 elevado a la 63
         //y 2 elevado a la 63, menos 1
         long variableLong = 6541321653165135L; //debe llevar una L al final de la literal
         // por convencion utilizamos una L mayuscula
         System.out.println(variableLong);

         //float - ocupa 4 bytes y representa un numero con decimales
         //tiene alrededor de 6-7 digitos de precicsion total
         float variableFloat = 123.23f; //debe llevar una f al final de la literal
         // los decimales se separan con punto.
         System.out.println(variableFloat);

         //double - ocupa 8 bytes y representa un numero con decimales
         //tiene alrededor de 15-16 digitos de precision total
         double variableDouble = 123.23; //no hace falta agregar letra al final de la literal
         System.out.println(variableDouble);

         //boolean - almacena solo 2 valores posibles (true o false)
         boolean variableBoolean = true;
         System.out.println(variableBoolean);

         //char - ocupa 2 bytes y almacena un numero entero que representa un caracter de la tabla unicode (ascii)
         char variableChar = 65;
         System.out.println(variableChar);
         //tambien se puede almacenar el caracter directamente
         variableChar = 'f'; //los caracteres van encerrados entre comillas simples
         System.out.println(variableChar);

         //** String **
         //no es un tipo de dato primitivo
         //es una clase, se debe escribir con mayuscula
         //representa una cadena de caracteres
         String variableString = "Hola a Todos";
         System.out.println(variableString);

         /*
          * tipos de escritura
          * camel case -> estoEsUnaCamelCase (variables y metodos)
          * pascal case -> EstoEsUnaFraseConPascalCase (clases e interfaces)
          * snake case -> esto_es_una_frase_con_snake_case (sql)
          * kebab case -> esto- es-una-frase-con-kebab-case (carpetas o proyectos)
          */
         
         //tipos de datos var (inferencia de tipos)
         //aparece a partir de JDK 10
         //no es un tipo de datos en si mismo. es una palabra clave que indica al compilador que
         //infiera el tipo de dato a partir de la primera asignacion de valor
         var var1= 100;  //int
         var var2 = 'c'; //char
         var var3 = "c"; //String
         var var4 = true; //boolean
         var var5 = 12.23; //double
         var var6 = 12.23f; //float
         var var7 = 31351531L; //long
         
         //este tipo de dato solo puede ser usado en variables locales
         //no puede ser usado comp parametro ni atributo de clase
         //no se puede declarar un var sin asignar valor
         //no es un tipo de dato dinamico, no se puede reasignar la variable a otro tipo distinto.

         //concatenacion de cadenas

         //operador de concatenacion +
         String nombre = "Nashira";
         System.out.println("Mi nombre es " + nombre);

         //metodo String.format()
         //permite formatear cadenas
         int edad = 27;
         String mensaje =  String.format ("Mi nombre es %s y mi edad es de %d años.", nombre, edad);
         System.out.println(mensaje);
         /*
          * format() utiliza marcadores de posicion
          * %s -> cadenas de caracteres
          * %d -> numeros enteros
          * %f -> numeros con decimales
          * %n -> salto de linea
          */

          //metodo System.out.printf()
          //se utiliza para imprimir con formato
          System.out.printf("Mi nombre es %s y mi edad es de %d años.", nombre, edad);
          System.out.println();

          System.out.println("1");
          System.out.println("2");
          System.out.println("***************");
          System.out.print("1");
          System.out.print("2\n"); //\n genera el salto de linea

          System.out.println("coso");

          //operadores
          //operadores aritmeticos
          /*
           * + suma
           * - resta
           * * multiplicacion
           * / division
           * % modulo o resto de la division
           * Son operandores binarios porque necesitan de dos operandos.
           * Los operandos son numericos y el resultado es numerico.
           */

           //operador de asignacion
           /*
            * = asignacion
            * += suma y asignacion
            * -= resta y asignacion
            * *= multiplicacion y asignacion
            * %= modulo y asignacion
            * Son operadores binarios.
            * Asignan el valor a una variable y se la modifican utilizando una expresion.
            */

            variableInt = 10; //asignando valor
            variableInt +=2; //vale 12 -> variableInt = variableInt+2;
            variableInt -=1; //vale 11 -> variableInt = variableInt-1;

            //operadores incrementales y decrementales
            /*
             * ++ incrementa en 1 el valor de la variable
             * -- decrementa en 1 el valor de la variable
             * Puede utilizarse de dos formas:
             * prefijo: (++x o --x) La variable se modifica antes de que se use su valor en una expresion
             * sufijo: (x++ o x--) La variable se modifica despues de que se use su valor en una expresion
             */

             //operadores relacionales
             /*
              * > mayor
              * < menor
              * >= mayor o igual
              * <= menor o igual
              * != distinto
              * Son operadores binarios.
              * Los operadores son numericos y el resultado es booleano.
              */

              //operadores logicos
              /*
               * & AND (y logico)
               * | OR (o logico)
               * ! NOT (negacion)
               * Los operadores son boolenos y el resultado es booleano.
               */

               /*
                * Un operador logico & o | evalua ambas condiciones.
                * Con dos operadores && o || se evalua la primera condicion y si esta determina el
                * valor de verdad, ya no evalua las siguientes condiciones.
                */

                //Estructuras}

                //condicionales

                //if
                int numero1 = 100;
                int numero2 = 20;

                if (numero1 > numero2){
                    System.out.println("El numero1 es mayor que el numero2");
                }
                
                if (numero1 > numero2) System.out.println("El numero1 es mayor que el numero2");
                //mientras solo se ejecute una unica instruccion, se puede escribir el if en linea
                //sin las llaves

                //if-else
                if (numero1 > numero2) {
                    System.out.println("El numero1 es mayor que el numero2");
                } else {
                    System.out.println("El numero1 no es mayor que el numero2");
                }

                //if-else tambien se puede hacer en linea si solo hay una unica sentencia por bloque

                //if-else en cascada (if-else if-else)
                if (numero1 > numero2) {
                    System.out.println("El numero1 es mayor que el numero2");
                } else if n(numero1 > numero2){
                    System.out.println("El numero1 es menor que el numero2");
                } else {
                    System.out.println("Ambos numeros son iguales");
                }

                //if-else anidado
                edad =20;
                boolean tienePasaporte =true;
                if (tienePasaporte){
                    if (edad <=18){
                        System.out.println("Puede viajar solo");
                    }else{
                        System.out.println("Debe viajar acompañado");
                    }
                }else{
                    System.out.println("No puede viajar");
                }

                //operador ternario (if-else abreviado)
                //condicion ? valorSiVerdadero : valorSiFalso
                String mensaje2 = (edad>=18) ? "Mayor de edad" : "Menor de edad"
                

           








    
    }// fin del metodo main
}//fin de la clase
