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

public class ComputeAverage {

    public static void main(String[] args) {

        //creamos un objeto Scanner, para leer entrada de datos
        Scanner input = new Scanner(System.in);

        //indicamos al usuario que ingrese los datos que requerimos
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //calculamos el promedio de 3 numeros
        double average = (number1 + number2 + number3) / 3;

        //mostramos el resultado
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);

    }

}
