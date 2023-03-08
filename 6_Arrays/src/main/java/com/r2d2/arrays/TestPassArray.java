/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.arrays;

/**
 *
 * @author Arturo
 */
public class TestPassArray {

    public static void main(String[] args) {

        int[] a = {1, 2};

        // Intercambio de elementos, usando el metodo swap
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        //Intercambio de elementos usando el metodo swapFirstTwoInArray
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    //intercambio de dos variables
    public static void swap(int n1, int n2) {

        // intercambio de n1 con n2
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    //Intercambiamos los primeros dos elementos en un arreglo
    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

}
