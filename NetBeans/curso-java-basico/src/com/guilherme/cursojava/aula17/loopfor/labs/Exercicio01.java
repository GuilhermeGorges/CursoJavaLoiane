/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.loopfor.labs;


import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true){
            System.out.println("Digite um número de 0 á 10: ");
            int num = scan.nextInt();
            
            if (num >= 0 && num <= 10){
                System.out.println(num + " foi o valor escolhido.");
                break;
            } else {
                System.out.println("Valor inválido");
            }
        }
        
    }
  
}
