/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula15.labs.*;
import com.guilherme.cursojava.aula13.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio12 {
    public static void main(String[] args) {
        
        int counter = 0; 
        
        int[] a = new int[11];
        for (int i = 0; i < 11; i++){
            a[i] = i;            
            counter += i;
        }
        System.out.print("A = 0");
        for (int i = 1; i < 11; i++){
        System.out.print( " + " + a[i]);
        }
        
        System.out.println(" = "+counter);
    }    
    
}
