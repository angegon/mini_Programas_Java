
package com.mycompany.proyecto_3_promediotresnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angegon
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        Integer numero1, numero2, numero3;
        
        System.out.println("Introduce el primer número: ");
        numero1 = cargarNumero();
        
        System.out.println("Introduce el segundo número: ");
        numero2 = cargarNumero();        
        
        System.out.println("Introduce el tercer número: ");
        numero3 = cargarNumero();
        
        promedio(numero1, numero2, numero3);
        
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
     * Devuelve elpromedio de 3 números
     * @param numero1
     * @param numero2
     * @param numero3 
     */
    private static void promedio(Integer numero1, Integer numero2, Integer numero3) {
        
        Float promedio;
        
        promedio = (float)(numero1 + numero2 + numero3) / 3;
        
        System.out.println("El promedio de los 3 números es: " + promedio);
    }
}
