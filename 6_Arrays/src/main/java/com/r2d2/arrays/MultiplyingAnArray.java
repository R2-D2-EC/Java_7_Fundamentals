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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultiplyingAnArray {

    public static void main(String[] args) {

        int[] myArray = {5, 7, 8, 4, 3, 9, 7}; //array unidimensional
        int mult = 3;

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        System.out.println(list);
        
        System.out.println("Original array:");
        printArray(myArray);

        System.out.println("\nProcessed array:");
        int[] arrayByMult = arrayByMult(myArray, mult);
        printArray(arrayByMult);
        
        
    }

    public static int[] arrayByMult(int[] myArray, int mult) {
        
        int[] result = new int[myArray.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = myArray[i] * mult;
        }

        return result;
    }

    public static void printArray(int[] myArray) {
        for (int e : myArray) {
            System.out.printf("[%2d] ",e);
        }
    }
}
