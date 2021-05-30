/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17loopfor.labs;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor que voce quer saber o fatorial: ");
        int fat = scan.nextInt();
        int fatorial = 1;
        
        System.out.print(fat + " ! = ");
        for (int i=fat; i > 0; i--){  
            fatorial *= i;  
            System.out.println(i);   
        }
        System.out.println("resultado = "+ fatorial);
        
    }
}
