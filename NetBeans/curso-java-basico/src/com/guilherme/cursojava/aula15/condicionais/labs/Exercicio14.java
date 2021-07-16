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
public class Exercicio14 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota do aluno ");
        float nota1 = scan.nextFloat();
                
        System.out.println("Digite a segunda nota do aluno ");
        float nota2 = scan.nextFloat();
        
        double media = (nota1 + nota2) / 2;
        
        if (media <= 4){
            System.out.println("E");
        } else if (media <= 6){
            System.out.println("D");
        } else if (media <= 7.5){
            System.out.println("C");
        } else if (media <= 9){
            System.out.println("B");
        } else{
            System.out.println("A");
        }
        
    }
}
