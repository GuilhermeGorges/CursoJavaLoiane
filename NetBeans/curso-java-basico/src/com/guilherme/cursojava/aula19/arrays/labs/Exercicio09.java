/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.arrays.labs;

/**
 *
 * @author Gui e Di
 */
public class Exercicio09 {
    public static void main(String[] args) {
        
        
        int[] a = new int[11];
        int[] b = new int[a.length];
        double[] c = new double[a.length];
        
        for (int i = 1; i < a.length; i++){
            b[i] = a[i] = i;
            c[i] = a[i] / b[i];
        }
        
        for (int i = 1; i < a.length; i++){

            System.out.print("A = "+a[i]);
            System.out.print(" B = "+b[i]);
            System.out.print(" C = "+c[i]+"\n");
        }
    }
}
