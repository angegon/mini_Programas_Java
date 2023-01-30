
package com.mycompany.proyecto_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angegon
 */
public class Main {
    public static void main(String[] args) throws IOException{
        
        String nombre = "Ángel";
        String frase = "mi nombre es: " + nombre;
        Integer followersInstagram = 123;
        Integer followersYoutube = 321;
        Integer edad;
        Boolean esmMayorDeEdad; 
        
        System.out.println("Hola " + frase + "!!!, Tengo " + followersInstagram + " followers.");
        System.out.println("Tengo un total de " + (followersInstagram + followersYoutube) + " followers." );
       
        /* Lectura desde teclado */
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Introduce tu edad:");
        String strEdad = buffer.readLine();
        edad = Integer.parseInt(strEdad);
        
        esmMayorDeEdad =  edad >= 18 ; 
        
        if (esmMayorDeEdad) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }


    }
}
