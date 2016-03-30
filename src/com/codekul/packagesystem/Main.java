/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.packagesystem;

import com.codekul.packagesystem.car.Audi;
import com.codekul.packagesystem.car.Car;

/**
 *
 * @author aniruddha
 */
public class Main {
    
    public static void main(String[] args) {
        
        Car car = new Car();
        
        car.carName = 10;
        
        car.carName = 20;
        car.setCarName(20);
        
        Beetle beetle = new Beetle();
        beetle.carName = 10;
        
        Audi audi = new Audi();
        audi.carName = 50;
    }
    
}
