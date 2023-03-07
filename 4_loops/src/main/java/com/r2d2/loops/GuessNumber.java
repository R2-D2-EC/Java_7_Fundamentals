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

public class GuessNumber {
    
    public static void main(String[] args) {
        
        // generamos un numero aleatorio, para que sea adivinado [0,100]
        int number = (int)(Math.random() * 101);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        
        int guess = -1;
        while (guess != number){
            // pedimos la entrada al usuario
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            
            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }//final del ciclo
    }
}
