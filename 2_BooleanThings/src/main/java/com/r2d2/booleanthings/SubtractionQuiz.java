/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.booleanthings;

/**
 *
 * @author Arturo
 */
import java.util.Scanner;

public class SubtractionQuiz {

    public static void main(String[] args) {

        // 1. Generamos dos enteros aleatorios
        int number1 = (int) (1 + (Math.random() * 10));
        int number2 = (int) (1 + (Math.random() * 10));

        // 2. Si number1 < number2, intercambiamos con number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        //Preguntamos: "¿Cuanto es número1 - número2?"
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        //evaluamos la respuesta y mostramos el resultado
        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }

}
