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
public class Exercicio22 {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int[] vetorA = new int[10];
        int zero = 0;
        int percentualZero = 0;
        int um = 0;
        int percentualUm = 0;
        
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random()*1);
            if (vetorA[i] == 0){
                zero++;
            } else {
                um++;
            }
        }
        
        percentualUm = (um * 100) / vetorA.length;
        percentualZero = (zero * 100) / vetorA.length;
        
        System.out.println(percentualZero + " % Zero.");
        System.out.println(percentualUm + " % Um.");
    }
}
