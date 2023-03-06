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

public class ChineseZodiac {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0: System.out.println("monkey"); break; //mono 
            case 1: System.out.println("rooster"); break; //gallo 
            case 2: System.out.println("dog"); break; //perro
            case 3: System.out.println("pig"); break; //cerdo
            case 4: System.out.println("rat"); break; //rata
            case 5: System.out.println("ox"); break; //buey
            case 6: System.out.println("tiger"); break; //tigre
            case 7: System.out.println("rabbit"); break; //conejo
            case 8: System.out.println("dragon"); break;
            case 9: System.out.println("snake"); break; //serpiente
            case 10: System.out.println("horse"); break;//caballo
            case 11: System.out.println("sheep"); //cabra
        }
    }
}
