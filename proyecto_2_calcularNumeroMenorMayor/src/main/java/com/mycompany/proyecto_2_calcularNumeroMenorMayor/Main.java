
package com.mycompany.proyecto_2_calcularNumeroMenorMayor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angegon
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Integer num1, num2, num3;
        
        System.out.println("Introduce el primer numero:");
        num1 = cargarNumero();
        
        System.out.println("Introduce el segundo numero:");
        num2 = cargarNumero();
        
        System.out.println("Introduce el tercer numero:");
        num3 = cargarNumero();
        
        calcularNumeroMayor(num1, num2, num3);
        calcularNumeroMenor(num1, num2, num3);
    }
    
    /**
     * Estña función sirve para mostrar el calculo del numero mayor
     * @param num1 es el primer numero
     * @param num2 es el segundo numero
     * @param num3 es el terceer numero
     */
    private static void calcularNumeroMayor(Integer num1, Integer num2,Integer num3){
        
        Integer numMayor;
        
        numMayor = num1;
        if (num2 > numMayor ){
            numMayor = num2;
        }
        if (num3 > numMayor){
            numMayor = num3;  
        }

        System.out.println("El número mayor es: " + numMayor);          
    }
    
    /**
     * Está función sirve para mostrar el calculo de un número mayor
     * @param num1 es el primer numero
     * @param num2 es el segundo numero
     * @param num3 es el terceer numero
     */
    private static void calcularNumeroMenor(Integer num1, Integer num2,Integer num3){
    
        Integer numMenor;
        
        numMenor = num1;
        if (num2 < numMenor){
            numMenor = num2;    
        }
        if (num3 < numMenor){
            numMenor = num3;  
        }
        
        System.out.println("El número menor es: " + numMenor);              
    }
    
    /**
     * Está función lee de teclado un número y lo devuelve convertido en entero
     * @return número entero
     * @throws IOException 
     */
    private static Integer cargarNumero() throws IOException{
        
        String strNumero;
        Integer numero;
        
        /* Lectura desde teclado */
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        strNumero = buffer.readLine();
        numero = Integer.parseInt(strNumero);        
        return numero;
    }
}
