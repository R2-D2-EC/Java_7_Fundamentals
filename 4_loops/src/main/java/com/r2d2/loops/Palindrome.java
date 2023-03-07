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

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int low = 0;

        int high = s.length() - 1;

        boolean isPalindrome = true;

        while (low < high && isPalindrome) {

            if (s.charAt(low) != s.charAt(high))
                isPalindrome = false;
            
            low++;
            high--;
        }

        if (isPalindrome) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("is not a palindrome");
        }
        

    }
    //ana
    //mom
    //arañara
    //Nadan
    //Oruro
    //Rayar
    //Somos

}
