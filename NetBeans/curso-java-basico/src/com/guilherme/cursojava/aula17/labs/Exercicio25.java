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
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double preco = 0;
        double totalCompra = 0; 
        double dinheiro = 0;
        double troco = 0;
        boolean sair = false;
        int count = 1;
        
        System.out.println("Lojas Tabajara ");
        
        do {
            System.out.print("Produto "+ count + " R$ ");
            preco = scan.nextDouble();
            
            if (preco != 0){
                totalCompra += preco;
            } else {
                sair = true; 
            }  
            count++;
        }while (!sair);
    
        
        System.out.print("Dinheiro: R$ ");
        dinheiro = scan.nextDouble();
        
        troco = dinheiro - totalCompra;
        
        System.out.println("Troco: R$ "+ troco);
        System.out.println("...");
        
        
        
    }
}
