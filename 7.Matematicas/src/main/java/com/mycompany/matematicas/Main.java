/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matematicas;

/**
 *
 * @author luis
 */
public class Main {
    
    public static void main(String[] args) {
        
        double area, base, altura, radio;
        altura = 5.0;
        base = 7.0;
        area = base * altura / 2.0;
        System.out.println("Cálculo del área de un triángulo");
        System.out.println("Base: " + base + ", Altura: "+ altura + " -> Área: " + area);
        System.out.println("\n\n");
        System.out.println("Cálculo del área de un círculo");
        radio = 5.0;
        area = Math.PI * Math.pow(radio, 2.0);
        System.out.println("Radio: " + radio + " -> Área: " + area);
        
        
    }
    
}
