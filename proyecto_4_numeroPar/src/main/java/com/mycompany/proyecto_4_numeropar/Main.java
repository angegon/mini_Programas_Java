
package com.mycompany.proyecto_4_numeropar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angegon
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        Integer numero;
        
        System.out.println("Introduce un número: ");
        numero = cargarNumero();
        
        esPar(numero);
    }
    
    /**
     * Lee números de teclado y devuelve el entero
     * @return 
     * @throws java.io.IOException 
     */
    public static Integer cargarNumero() throws IOException{
        
        String strNumero;
        Integer numero;
        
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        strNumero = buffer.readLine();
        numero = Integer.parseInt(strNumero);
        return numero;
    }    

    /**
     * Calcula si el numero es par o impar
     * @param numero 
     */
    private static void esPar(Integer numero) {
        
        Boolean esPar = numero % 2 == 0;
        
        if (esPar){
            System.out.println("El número introducido es par.");
        } else {
            System.out.println("El número introducido es impar.");
        }
    }
}
