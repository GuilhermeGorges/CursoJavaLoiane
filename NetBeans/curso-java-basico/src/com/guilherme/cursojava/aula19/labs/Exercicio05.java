/*
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
public class Exercicio05 {
    public static void main(String[] args) {
        
        int[] a = new int[10];
        for (int i = 0; i < 10; i++){
            a[i] = i;
        }
        
        int[] b = new int[10];
        for (int i = 0; i < 10; i++){
            b[i] = (a[i]*i);
        }
        
        for (int i = 0; i < 10; i++){
        System.out.print("A = "+a[i]);
        System.out.print(" B = "+b[i]+"\n");
        }
    }
    
}
