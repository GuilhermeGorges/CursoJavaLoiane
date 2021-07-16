/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula13.operadores.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros e um real: ");
        
        int first = scan.nextInt();
        int second = scan.nextInt();
        float third = scan.nextFloat();
        
        double answerA = (first * 2) * (second / 2);
        double answerB = (first * 3) + third;
        double answerC = Math.pow (third, 3);
        
        System.out.println("Resposta A: "+ answerA);
        System.out.println("Resposta B: "+ answerB);
        System.out.println("Resposta C: "+ answerC);
        
    }
}
