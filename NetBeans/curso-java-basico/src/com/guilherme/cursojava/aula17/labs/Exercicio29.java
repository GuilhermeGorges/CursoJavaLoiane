/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.labs;

import com.guilherme.cursojava.aula15.labs.*;
import com.guilherme.cursojava.aula13.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio29 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Digite o limite de numeros primos de 1 até  ");
        int rage = scan.nextInt();
        
        
        System.out.println("São primos:");
        for (int p = 2; p<rage; p++){
            int num = p;
            boolean primo = true;

            for (int i = 2; i<num; i++){
                if (num%i == 0){
                    primo = false;
                } 

            }
            if (primo) {
                System.out.print(num + " - ");
            }
        }    
    }
}
