/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.arrays.labs;

/**
 *
 * 
 */
public class Exercicio07 {
    public static void main(String[] args) {
        
        
        int[] a = new int[10];
        for (int i = 0; i < 10; i++){
            a[i] = i;
        }
        
        int[] b = new int[10];
        for (int i = 0; i < 10; i++){
            b[i] = i;
        }
        
        int[] c = new int[10];
        for (int i = 0; i < 10; i++){
            c[i] = a[i] - b[i];
        }
        
        for (int i = 0; i < 10; i++){

            System.out.print("A = "+a[i]);
            System.out.print(" B = "+b[i]);
            System.out.print(" C = "+c[i]+"\n");
        }
    }
}
