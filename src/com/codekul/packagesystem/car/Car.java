/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.packagesystem.car;

/**
 *
 * @author aniruddha
 */
public class Car {

    public int carName; 
    private int carModel; // within the class only
    protected int carColor;
    int carCompany;
    
    public void setCarName(int cN){
        carName = cN;
    }
    
    /*<access-modifier> <return-type> <name-of-function>(<parameters>)*/
    public void getCarColor(){
        
        return;
    }
    
    public int getName(){
        
        return carName;
    }
}
