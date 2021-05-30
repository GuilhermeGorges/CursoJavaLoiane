/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19arrays.labs;

import com.guilherme.cursojava.aula15.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio36 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        double[] vetorA = new double[11];
        
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = Math.pow(2, i);
        }
        
        
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
    }
}
