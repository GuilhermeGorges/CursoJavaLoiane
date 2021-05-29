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
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Digite o combustivel desejado [A = Alcool - G = Gasolina]");
        String combustivel = scan.nextLine().toUpperCase();
        
        System.out.println("Quantos litros? ");
        float litros = scan.nextInt();
        
        
        if ("A".equalsIgnoreCase(combustivel)){
            double alcool = 1.9;
            if (litros > 20){
                double desconto = (litros * alcool) * 0.05;
                double valorFinal = (litros * alcool) - desconto;
                System.out.println("O combustivel selecionado foi alcool.");
                System.out.println("Foram abastecidos " + litros + " litros. ");
                System.out.println("Você recebeu um desconto de R$ "+ desconto);
                System.out.println("Voce precisa pagar R$ "+ valorFinal);
            } else {
                double desconto = (litros * alcool) * 0.03;
                double valorFinal = (litros * alcool) - desconto;
                System.out.println("O combustivel selecionado foi alcool.");
                System.out.println("Foram abastecidos " + litros + " litros. ");
                System.out.println("Você recebeu um desconto de R$ "+ desconto);
                System.out.println("Voce precisa pagar R$ "+ valorFinal);
            }
        } else if ("G".equalsIgnoreCase(combustivel)){
            double gasolina = 2.5;
            if (litros > 20){
                double desconto = (litros * gasolina) * 0.06;
                double valorFinal = (litros * gasolina) - desconto;
                System.out.println("O combustivel selecionado foi gasolina.");
                System.out.println("Foram abastecidos " + litros + " litros. ");
                System.out.println("Você recebeu um desconto de R$ "+ desconto);
                System.out.println("Voce precisa pagar R$ "+ valorFinal);
            } else {
                double desconto = (litros * gasolina) * 0.04;
                double valorFinal = (litros * gasolina) - desconto;
                System.out.println("O combustivel selecionado foi gasolina.");
                System.out.println("Foram abastecidos " + litros + " litros. ");
                System.out.println("Você recebeu um desconto de R$ "+ desconto);
                System.out.println("Voce precisa pagar R$ "+ valorFinal);
            }           
        } else { 
            System.out.println("Combustível inexistente");
        }
    }   
    
}
