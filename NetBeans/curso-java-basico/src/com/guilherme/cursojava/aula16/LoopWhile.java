/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula16;

/**
 *
 * @author Gui e Di
 */
public class LoopWhile {
    public static void main(String[] args) {
        
        int i = 1;
        int max = 10;
        
        while (i <= max){
            System.out.println("Valor de i: " + i++);
        }
        System.out.println("Valor de i: " + i);
        
        do {
            System.out.println("Valor de i: " + ++i);
        } while (i < 15);
        System.out.println(i);
    }
}
