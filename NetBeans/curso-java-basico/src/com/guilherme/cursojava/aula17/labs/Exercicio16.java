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
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o n-ésimo termo da série de fibonacci:");
        int n = scan.nextInt();
        
        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;
        
        System.out.println(primeiro);
        System.out.println(segundo);
        
        while (proximo < 500){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.println(proximo);            
                        
        } 
    
    } 
    
}
