/*
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
public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite dois valores a serem somados: ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        
        System.out.println("O resultado da soma entre os valores " + firstNumber + " e " + secondNumber + " é " + (firstNumber + secondNumber));
        
    }
}
