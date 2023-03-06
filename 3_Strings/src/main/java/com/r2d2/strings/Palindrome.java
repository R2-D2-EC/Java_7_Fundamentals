/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.strings;

/**
 *
 * @author Arturo
 */
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //solicitamos una cadena
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        //convertimos la cadena en un objeto StringBuilder
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse(); //le damos la vuelta

        //convertimos a String sb, que era de tipo StringBuilder
        String s2 = sb.toString();

        // mostramos el resultado
        System.out.println(s1 + " a palindrome? " + s1.equals(s2));

    }
}
