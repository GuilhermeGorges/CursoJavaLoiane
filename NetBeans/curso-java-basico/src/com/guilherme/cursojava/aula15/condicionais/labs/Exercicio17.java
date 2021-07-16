/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.condicionais.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio17 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();
        
        if (ano%4 == 0){
            if (ano%100 != 0){
                
                System.out.println(ano + " é um ano BISEXTO");
                
            } else {
                if (ano%400 == 0){
                    
                System.out.println(ano + " é um ano BISEXTO");
                
                } else {

                    System.out.println(ano + " não é um ano BISEXTO");
                }
            }
        } else {
                
                System.out.println(ano + " não é um ano BISEXTO");
            }
        
        
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
                System.out.println(ano + " é um ano BISEXTO");
        } else {
                
                System.out.println(ano + " não é um ano BISEXTO");
            }
    }
    
}
