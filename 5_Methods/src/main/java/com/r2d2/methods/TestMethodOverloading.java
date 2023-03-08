/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.methods;

/**
 *
 * @author Arturo
 */
public class TestMethodOverloading {

    public static void main(String[] args) {
        
        //int[] b = new int[10]; //40bytes
        //b = 24;
        //24 25 26 27 28 29 ... n | direccion de memoria en el sistema
        //[2] [3] [9] 
        
        //*(b + 0) -> *(24 + 0) -> *(24) -> 2 
        //*(b + 1) -> *(24 + 1) -> *(25) -> 3

        
        
        // Invocacion del metodo max, con dos parametros de tipo int
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));

        // Invocacion del metodo max, con dos parametros de tipo double
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));

        // Invocacion del metodo max, con tres parametros de tipo double
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));

    }

    //retornamos el maximo de dos numeros int
    public static  int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    //retornamos el maximo de dos numeros double
    public static double max(double num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }

  
    //retornamos el maximo de tres numeros double
    public static double max(double num1, double num2, double num3) {
        return max( max(num1, num2), num3);
    }
    
    
}   
    