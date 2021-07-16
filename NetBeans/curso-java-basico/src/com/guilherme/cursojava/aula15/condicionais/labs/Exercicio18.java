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
public class Exercicio18 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero: ");
        int num = scan.nextInt();
        
        if (num%2 == 0){
            System.out.println(num + " É par!");
        } else {
            System.out.println(num + " Não é par");
        }
    }
}
    
