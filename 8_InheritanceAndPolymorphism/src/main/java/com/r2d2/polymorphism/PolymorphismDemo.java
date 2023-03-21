/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.polymorphism;

import com.r2d2.inheritance.CircleFromSimpleGeometricObject;
import com.r2d2.inheritance.RectangleFromSimpleGeometricObject;
import com.r2d2.inheritance.SimpleGeometricObject;

/**
 *
 * @author Arturo
 */
public class PolymorphismDemo {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Display circle and rectangle properties
        displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
        displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }

    /**
     * Display geometric object properties
     */
    public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
