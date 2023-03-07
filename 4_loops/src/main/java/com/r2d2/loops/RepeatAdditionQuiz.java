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

public class RepeatAdditionQuiz {

    public static void main(String[] args) {

        int number1 = (int) (1 + (Math.random() * 10));
        int number2 = (int) (1 + (Math.random() * 10));

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }

        System.out.println("You got it!");

    }
}
