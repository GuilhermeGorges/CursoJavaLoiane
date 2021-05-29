/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17z.labs.exercicios;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Entre com um numero ");
        int num = scan.nextInt();
        
        boolean primo = true;
        
        for (int i = 2; i<num; i++){
            if (num%i == 0){
                System.out.println("Não é primo - divisivel por " + i);
                primo = false;
            } 
            
        }
        if (primo) {
            System.out.println("É primo");
        }
        
    }
}
