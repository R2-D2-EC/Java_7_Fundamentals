/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.loops;

/**
 *
 * @author Arturo
 */
import java.util.Scanner;

public class TestDoWhile {

    public static void main(String[] args) {

        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        // Seguimos leyendo mientras la entrada sea distinta de 0.
        do {
            // Leemos el siguiente dato
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
