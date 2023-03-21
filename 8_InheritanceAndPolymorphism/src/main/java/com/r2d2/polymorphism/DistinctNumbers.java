/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class DistinctNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt(); // Read a value from the input

            if (!list.contains(value) && value != 0) {
                list.add(value); // Add the value if it is not in the list
            }
        } while (value != 0);

        // Display the distinct numbers
        
        for(int i: list)
            System.out.print(i + " ");
        
    }
}
