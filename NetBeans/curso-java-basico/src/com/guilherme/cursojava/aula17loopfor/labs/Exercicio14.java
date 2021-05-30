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
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int par = 0;
        int impar = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número inteiro: ");
            num = scan.nextInt();
            
            if (num%2 == 0){
                par++;
            } else {
                impar++;
            }            
        }
        System.out.println("Pares: "+ par);
        System.out.println("Impares: "+ impar);
    }
}
