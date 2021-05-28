/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula15.labs.*;
import com.guilherme.cursojava.aula13.labs.*;
import static java.lang.Math.sqrt;

/**
 *
 * @author Gui e Di
 */
public class Exercicio04 {
    public static void main(String[] args) {
        
        int[] a = new int[15];
        for (int i = 0; i < 15; i++){
            a[i] = i;
        }
        
        int[] b = new int[15];
        for (int i = 0; i < 15; i++){
            b[i] = (int) sqrt(a[i]);
        }
        
        for (int i = 0; i < 15; i++){
        System.out.print("A = "+a[i]);
        System.out.print(" B = "+b[i]+"\n");
        }
    }
    
}
