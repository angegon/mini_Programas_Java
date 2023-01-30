
package com.mycompany.proyecto_6_numerosprimos;

/**
 * Programa para calcular los 100 primeros números primos
 * @author angegon
 */
public class Proyecto_6_numerosPrimos {

    public static void main(String[] args) {
        Integer numero, contador, saltoLinea;
        //Boolean esPrimo;
        String resultado;
        
        numero = 0;
        contador = 0;
        saltoLinea = 1;
        resultado = "";
        
        System.out.println("Inicio calculo 100 primeros números primos:\n");
        
        while (contador < 100){
            if (esPrimo(numero)){
                resultado += numero + ", ";
                if (saltoLinea == 20){
                    resultado += "\n";
                    saltoLinea = 0;
                }
                saltoLinea++;
                contador++;                
            }
            numero++;
        }
        
        System.out.println(resultado);
        System.out.println("Fin!");
    }
    
    /**
     * Devuelve true si el numero recibido como parametro es primo
     * @param numero
     * @return 
     */
    private static boolean esPrimo (Integer numero){
            Integer aux;
            //esPrimo = true;
            if (numero == 0 || numero == 1 || numero == 4){
                return false;
            }            
            for (aux = 2; aux < numero /2; aux++ ){
                if (numero % aux == 0){
                   return false;                       
                }
            }
        return true;
    }
}
