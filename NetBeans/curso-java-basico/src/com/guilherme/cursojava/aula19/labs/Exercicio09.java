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
public class Exercicio09 {
    public static void main(String[] args) {
        
        
        int[] a = new int[11];
        for (int i = 1; i < 11; i++){
            a[i] = i;
        }
        
        int[] b = new int[11];
        for (int i = 1; i < 11; i++){
            b[i] = i;
        }
        
        int[] c = new int[11];
        for (int i = 1; i < 11; i++){
            c[i] = a[i] / b[i];
        }
        
        for (int i = 1; i < 11; i++){

            System.out.print("A = "+a[i]);
            System.out.print(" B = "+b[i]);
            System.out.print(" C = "+c[i]+"\n");
        }
    }
}
