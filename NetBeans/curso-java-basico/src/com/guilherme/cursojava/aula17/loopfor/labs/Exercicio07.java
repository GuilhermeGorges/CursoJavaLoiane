/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.loopfor.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        int maior = 0;
        for (int i = 0; i < 5; i++){
            
            System.out.println("Entre com um número: ");
            num = scan.nextInt();
            if (num > maior){
                maior = num;
            }
        }
        
        System.out.println("O maior numero digitado foi: "+ maior);
    }
    
}
