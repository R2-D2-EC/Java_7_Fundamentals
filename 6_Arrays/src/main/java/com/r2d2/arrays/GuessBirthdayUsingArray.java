/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.arrays;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class GuessBirthdayUsingArray {

    public static void main(String[] args) {
        
        
        /*
        int[][] matrix = {{33,13,6,2,1}, {0,71,6,3}, {7,0,8}};
        
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print("["+matrix[i][j]+"]");
            }
            System.out.println();
        }
        */
        
        
        int day = 0; // Day to be determined
        int answer;

        int[][][] dates = {
            
            {{1, 3, 5, 7},
            {9, 11, 13, 15},
            {17, 19, 21, 23},
            {25, 27, 29, 31}},
            
            {{2, 3, 6, 7},
            {10, 11, 14, 15},
            {18, 19, 22, 23},
            {26, 27, 30, 31}},
            
            {{4, 5, 6, 7},
            {12, 13, 14, 15},
            {20, 21, 22, 23},
            {28, 29, 30, 31}},
            
            {{8, 9, 10, 11},
            {12, 13, 14, 15},
            {24, 25, 26, 27},
            {28, 29, 30, 31}},
            
            {{16, 17, 18, 19},
            {20, 21, 22, 23},
            {24, 25, 26, 27},
            {28, 29, 30, 31}}
        };

        Scanner input = new Scanner(System.in);
    
        for (int i = 0; i < 5; i++) {
            System.out.println("Is your birthday in Set " + (i + 1) + "?");

            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.printf("%4d", dates[i][j][k]);
                }
                System.out.println();
            }

            System.out.print("\nEnter 0 for No and 1 for Yes: ");
            answer = input.nextInt();

            if (answer == 1) {
                day += dates[i][0][0];
            }
        }

        System.out.println("Your birthday is " + day);


    }

}
