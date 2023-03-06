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

public class DisplayTime {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //solicitamos la info. al usuario
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        
        int minutes = seconds / 60; // Vemos cuantos minutos tenemos, usando operaciones con enteros 
        int remainingSeconds = seconds % 60; //Obtenemos los segundos restantes
        
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
