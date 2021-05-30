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
public class Exercicio17 {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
                
        int somaMaiores35 = 0;
        int[] a = new int[10];
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite a idade da pessoa Nº "+ (i+1)+" ");
            a[i] = scan.nextInt();
            if (a[i]>35){
                somaMaiores35++;
            }
        }
        
        System.out.println(somaMaiores35 + " pessoas maiores de 35 anos.");
    }
    
}
