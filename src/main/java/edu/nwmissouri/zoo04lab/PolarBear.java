/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Maddelavedu Pravallika
 */
public class PolarBear extends Animal {
    
     public PolarBear(String name) {
       super(name); 
    }
    
    @Override
    public void move() {
        System.out.println(" Its head from side to side when it wants to play with another");
    }
    
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an polarBear! \n",this.name);
    }
    public static void main(String[] args) {
        var a = new PolarBear("Tester");
        a.speak();
        a.move();
        //a.profess();
    }

    
    
}
