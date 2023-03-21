/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.interfaces;

import com.r2d2.abstractclass.Rectangle;
import java.util.Arrays;

/**
 *
 * @author Arturo
 */
public class SortRectangles {

    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
            new ComparableRectangle(3.4, 5.4),
            new ComparableRectangle(13.24, 55.4),
            new ComparableRectangle(7.4, 35.4),
            new ComparableRectangle(1.4, 25.4)};
        
        Arrays.sort(rectangles);
        
        for (Rectangle rectangle : rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}
