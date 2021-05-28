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
public class Exercicio14 {
    public static void main(String[] args) {
        
        int counter = 0;
        int soma = 0;
        int media = 0;
        
        int[] a = new int[10];
        for (int i = 0; i < 10; i++){
            a[i] = i;
            if (a[i]%2 != 0){
                counter++;
                soma += a[i];
            }
        }
        
        media = soma / counter; 
        
        for (int i = 0; i < 10; i++){
        System.out.print("A = " + a[i]+ " ");
        }
        
        System.out.println("\nNo array A foram digitados "+counter+" Numeros impares.");
        System.out.println("A média destes valores é "+ media);
    } 
    
}
