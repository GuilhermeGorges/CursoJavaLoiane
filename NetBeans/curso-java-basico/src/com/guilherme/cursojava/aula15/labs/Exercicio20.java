/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio20 {    
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        
        int count = 0;
        
        System.out.println("Telefonou para a vitma?");
        String pergunta0 = scan.nextLine().toUpperCase();
        if ("SIM".equalsIgnoreCase(pergunta0)){
            count++; 
        }
        
        System.out.println("Esteve no local do crime?");
        String pergunta1 = scan.nextLine().toUpperCase();
        if ("SIM".equalsIgnoreCase(pergunta1)){
            count++; 
        }
        
        System.out.println("Mora perto da vitma?");
        String pergunta2 = scan.nextLine().toUpperCase();
        if ("SIM".equalsIgnoreCase(pergunta2)){
            count++; 
        }
        
        System.out.println("Devia para a vitma?");
        String pergunta3 = scan.nextLine().toUpperCase();
        if ("SIM".equalsIgnoreCase(pergunta3)){
            count++; 
        }
        
        System.out.println("Ja trabalhou com a vitma?");
        String pergunta4 = scan.nextLine().toUpperCase();
        if ("SIM".equalsIgnoreCase(pergunta4)){
            count++; 
        }
        
        switch (count){
            case 1: System.out.println("Inocente"); break;
            case 2: System.out.println("Suspeito"); break;
            case 3: System.out.println("Cúmplice");break;
            case 4: System.out.println("Cúmplice");break;
            case 5: System.out.println("Assassino"); break;
            default: System.out.println("Inocente");break;
        }
        
        
        
    }
}
