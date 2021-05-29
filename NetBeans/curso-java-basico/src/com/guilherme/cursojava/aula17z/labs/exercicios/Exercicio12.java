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
public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int tabuada;
        System.out.println("Digite a tabuada que você quer ver");
        int num = scan.nextInt();
        
        System.out.println("Tabuada de "+ num + ":");
        for (int i = 1 ; i < 11 ; i++){
            tabuada = i * num;
            System.out.println(num + " x " + i + " = " + tabuada);
        }
        
     
        
    }
    
}
