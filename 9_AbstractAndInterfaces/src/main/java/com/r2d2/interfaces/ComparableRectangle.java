/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.interfaces;

import com.r2d2.abstractclass.Rectangle;

/**
 *
 * @author Arturo
 */
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override // Implement the compareTo method defined in Comparable 
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override // Implement the toString method in GeometricObject
    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight() + " Area: " + getArea();
    }

}
