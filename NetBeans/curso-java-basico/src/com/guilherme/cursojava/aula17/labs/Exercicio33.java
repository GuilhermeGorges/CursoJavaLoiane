/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.labs;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio33 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de n");
        int n = scan.nextInt();
        double soma = 0;
        
        for (int i=1, j=1 ; i<=n ; i++, j+=2){
            System.out.print(i + "/" + j + " + ");
            soma += i/j;
        }
        System.out.println("soma "+ soma);       
                
                
                
                
                
                
                
    }
}
