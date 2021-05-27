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
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean naoTerminar = true;
        int cod, qtd;
        double total = 0;
        String output = "";
        
        do{
            System.out.println("Digite o código e a quantidade. Digite 0 0 para sair. ");
            cod = scan.nextInt();
            qtd = scan.nextInt();
            
            if (cod == 0 && qtd == 0 ){
                naoTerminar = false;
                output += "Total a pagar = " + total;
            } else {
                
                if (cod == 100){
                    output += "Cachorro Quente -> R$ 1,20 * " + qtd ;
                    output += " = " + (1.2*qtd) + "\n";
                    total += 1.2*qtd;
                } else if (cod == 101){
                    output += "Bauru Simples -> R$ 1,30 * " + qtd ;
                    output += " = " + (1.3*qtd) + "\n";
                    total += 1.3*qtd;
                } else if (cod == 102){
                    output += "Bauru com ovo -> R$ 1,50 * " + qtd ;
                    output += " = " + (1.5*qtd) + "\n";
                    total += 1.5*qtd;
                } else if (cod == 103){
                    output += "Hamburguer -> R$ 1,20 * " + qtd ;
                    output += " = " + (1.2*qtd) + "\n";
                    total += 1.2*qtd;
                } else if (cod == 104) {
                    output += "Cheeseburguer -> R$ 1,30 * " + qtd ;
                    output += " = " + (1.3*qtd) + "\n";
                    total += 1.3*qtd;
                } else if (cod == 105){
                    output += "Refrigerante -> R$ 1,0 * " + qtd ;
                    output += " = " + (1*qtd) + "\n";
                    total += 1*qtd;
                }
            }
        }while (naoTerminar);
    
        System.out.println(output);
    
    }     
}
