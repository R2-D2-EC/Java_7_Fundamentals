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
import java.util.Scanner; //importamos la clase del lugar adecuado

public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {

        //creamos un objeto Scanner, para leer entrada de datos
        Scanner input = new Scanner(System.in);

        //indicamos al usuario que ingrese los datos que requerimos
        System.out.print("Enter a number for radius: ");
        //leemos y asignamos los datos leidos
        double radius = input.nextDouble();

        //calculamos el area
        double area = radius * radius * 3.14159;
        
        //mostramos el resultado
        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }

}
