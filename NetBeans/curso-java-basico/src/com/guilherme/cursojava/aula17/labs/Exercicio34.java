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
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de N ");
        int n = scan.nextInt();
        
        
        System.out.print("H = 1");
        for (int i = 2; i < n; i++){
            System.out.print(" + 1/"+ i);
        }
        
        
        
        
    }
}
