/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.arrays.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio15 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        int imparPercentual = 0;
        int parPercentual = 0;
        int impar = 0;
        int[] a = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Digite o valor Nº "+ (i+1)+" ");
            a[i] = scan.nextInt();
            if (a[i]%2 != 0){
                impar++; 
            }            
        }
        System.out.println("Os valores do vetor A são ->");
        for (int i = 0; i < a.length; i++){
            System.out.print(" "+a[i]);
        }
        
        
        imparPercentual = impar * 10;
        System.out.println("\nO percentual de números impares é: " + imparPercentual + " %");
        parPercentual =  100 - imparPercentual;
        System.out.println("O percentual de números pares é: "+ parPercentual + " %");
        
    }
}
