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
public class TestPassByValue {

    public static void main(String[] args) {

        // Declaramos e inicializamos las variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

        // Invoke the swap method to attempt to swap two variables
        //invocamos al metodo swap
        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }

    //intercambio de dos variables
    public static void swap(int n1, int n2) {

        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);

        // intercambio de n1 con n2
        int temp = n1;
        n1 = n2;
        n2 = temp;
        
        System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);

    }
}
