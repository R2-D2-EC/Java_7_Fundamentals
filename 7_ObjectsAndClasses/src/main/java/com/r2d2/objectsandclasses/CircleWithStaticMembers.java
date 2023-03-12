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
public class CircleWithStaticMembers {

    /**
     * The radius of the circle
     */
    double radius;

    /**
     * The number of the objects created
     */
    static int numberOfObjects = 0;

    /**
     * Construct a circle with radius 1
     */
    CircleWithStaticMembers() {
        radius = 1.0;
        numberOfObjects++;
    }

    /**
     * Construct a circle with a specified radius
     */
    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Return numberOfObjects
     */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle
     */
    double getArea() {
        return radius * radius * Math.PI;
    }
}
