/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.arrays.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int counter = 0; 
        int[] a = new int[10];
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um valor: ");
            a[i] = scan.nextInt();
            if (a[i]%5 == 0){
                counter += a[i];
            }
        }
        System.out.print("A ");
        for (int i = 0; i < 10; i++){
        System.out.print( " - " + a[i]);
        }
        
        System.out.println("\nA soma dos valores multiplos de 5 do array resulta em = "+counter);
    }    
    
    
}
