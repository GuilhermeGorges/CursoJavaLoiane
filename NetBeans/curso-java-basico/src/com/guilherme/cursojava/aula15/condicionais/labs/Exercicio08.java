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
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do primeiro produto: ");
        float product1 = scan.nextFloat();
        
        System.out.print("Digite o valor do segundo produto: ");
        float product2 = scan.nextFloat();
        
        System.out.print("Digite o valor do terceiro produto: ");
        float product3 = scan.nextFloat();
        
        if (product1 < product2 && product1 < product3){
            System.out.println("Você deve comprar o primeiro produto");
        } else if (product2 < product1 && product2 < product3){
            System.out.println("Você deve comprar o segundo produto");
        } else {
            System.out.println("Você deve comprar o terceiro produto");
        }
    
    }
}
