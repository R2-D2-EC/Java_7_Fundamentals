/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.objectsandclasses;

/**
 *
 * @author Arturo
 */
public class SimpleCircle {

    double radius; //atribute

    /**
     * Construct a circle with radius 1
     */
    public SimpleCircle() {
        radius = 1;
    }

    /**
     * Construct a circle with a specified radius
     */
    public SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    
    /**
     * Return the area of this circle
     */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return the perimeter of this circle
     */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Set a new radius for this circle
     */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
    
}
