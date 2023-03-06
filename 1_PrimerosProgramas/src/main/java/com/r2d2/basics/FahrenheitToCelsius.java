/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.basics;

/**
 *
 * @author Arturo
 */
import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // Convertimos Fahrenheit a Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
    }

}
