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
public class VarArgsDemo {

    public static void main(String[] args) {
        //printMax(34, 3, 3, 2, 56.5);
        printMax(34, '2', 3, new double[]{1, 2, 3});
        printMax(34, '2', 3, 2, 56.5, 43.2, 2.2);
    }

    public static void printMax(int a, char b, float c, double... numbers) {
        
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("var arg[]:" +numbers[i] );
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The max value is " + max);
    }
}
