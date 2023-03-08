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
public class TestMax {

    //Metodo principal
    public static void main(String[] args) {

        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
   
    }

    //Regresa el maximo de dos numeros
    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        
        //System.out.println("The maximum of " + num1 + " and " + num2 + " is " + result);
        return result;
    }
    
     //double max

}
