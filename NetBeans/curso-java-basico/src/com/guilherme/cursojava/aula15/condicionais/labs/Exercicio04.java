/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.condicionais.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        while (true) {
        System.out.println("Digite uma letra ");   
        String caracter = scan.nextLine().toLowerCase();
        
            switch (caracter) {
                case "a": 
                case "e": 
                case "i": 
                case "o": 
                case "u": System.out.println("O caracter "+ caracter + " é uma vogal.");break;
                default: System.out.println("O caracter "+ caracter + " é uma consoante.");break;
            }
        }
    }
}
 