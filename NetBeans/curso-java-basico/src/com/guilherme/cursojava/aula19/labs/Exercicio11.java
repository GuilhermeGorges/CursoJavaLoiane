/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula15.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio11 {
    public static void main(String[] args) {
        
        int[] a = new int[10];
        int counter = 0;         
        
        for (int i = 0; i < a.length; i++){
            a[i] = i;
            if (a[i]%2 == 0){
                counter++; 
            }
        }
        
        for (int i = 0; i < a.length; i++){
        System.out.print("A = " + a[i]+ " ");
        }
        
        System.out.println("\nNo array A "+counter+" Numeros são pares.");
    }        
}
