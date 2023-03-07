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

public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		System.out.println("       Multiplication table");
		
		System.out.print("     ");
		
		for(int i = 1; i <= 9;i++ )
			System.out.print("   " + i);
		
		System.out.println("\n-------------------------------------------");
		
		for(int i = 1; i <= 9; i++) {
			System.out.print( i + " | ");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
		
	}

}
