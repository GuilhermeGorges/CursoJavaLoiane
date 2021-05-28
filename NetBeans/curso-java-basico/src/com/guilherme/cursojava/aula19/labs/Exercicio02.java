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
public class Exercicio02 {
    public static void main(String[] args) {
        int[] a = new int[8];
        for (int i = 0; i < 8; i++){
            a[i] = i;
        }
        
        int[] b = new int[8];
        for (int i = 0; i < 8; i++){
            b[i] = (a[i]*2);
        }
        
        for (int i = 0; i < 8; i++){
        System.out.print("A = "+a[i]);
        System.out.print(" B = "+b[i]+"\n");
        }
    }
}
